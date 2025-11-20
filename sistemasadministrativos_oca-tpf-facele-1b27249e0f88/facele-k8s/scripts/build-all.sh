#!/bin/bash
# deploy-facele.sh - Build + Deploy completo

echo "🚀 DESPLIEGUE COMPLETO FACELE K8S"

# 0. PARSE ARGUMENTOS
DEPLOY_DB=false
ENVIRONMENT="dev"

while [[ $# -gt 0 ]]; do
    case $1 in
        -db|--database)
            DEPLOY_DB="$2"
            shift 2
            ;;
        -e|--environment)
            ENVIRONMENT="$2"
            shift 2
            ;;
        *)
            echo "❌ Argumento desconocido: $1"
            echo "Uso: $0 [-e|--environment <env>] [-db|--database <true|false>]"
            exit 1
            ;;
    esac
done

echo "📦 Ambiente: $ENVIRONMENT"
echo "🗄️  Desplegar base de datos: $DEPLOY_DB"

# 1. VERIFICAR .env
if [ ! -f ".env" ]; then
    echo "❌ .env no encontrado. Creando desde env-example.txt..."
    cp env-example.txt .env
fi

# 2. CARGAR VARIABLES
export $(cat .env | grep -v '^#' | xargs)
echo "📋 Variables: WS=$JAR_WS | QP=$JAR_QP | QW=$JAR_QW"


# 3. BUILD IMÁGENES (resto del script igual...)
echo "🏗️  Verificando imágenes..."
# IMAGES_EXIST=$(docker images | grep -c facele)
# if [ $IMAGES_EXIST -eq 0 ]; then
    cd ../build/
    echo "🏗️  Construyendo imágenes..."
    docker build -f ws.Dockerfile -t facele-ws:latest --build-arg JAR_WS="$JAR_WS" . || { echo "❌ Build WS falló"; exit 1; }
    docker build -f qw.Dockerfile -t facele-qw:latest --build-arg JAR_QW="$JAR_QW" . || { echo "❌ Build QW falló"; exit 1; }
    docker build -f qp.Dockerfile -t facele-qp:latest --build-arg JAR_QP="$JAR_QP" . || { echo "❌ Build QP falló"; exit 1; }

    pwd
# else
#     echo "✅ Imágenes ya existen, saltando build"
# fi

# 
# 4. LIMPIAR K8S
echo "🧹 Limpiando Kubernetes..."
kubectl delete all --all --force --grace-period=0 2>/dev/null || true
sleep 3

# 5. DEPLOY DATABASE (OPCIONAL)
if [ "$DEPLOY_DB" = "true" ]; then
    echo "🗄️  Desplegando base de datos PostgreSQL..."
    cd ../base/secrets
    kubectl apply -f postgres-secret.yaml
    cd ../database
    kubectl apply -f postgres-deployment.yaml
    
    echo "⏳ Esperando a que PostgreSQL esté listo..."
    kubectl wait --for=condition=ready pod -l app=postgres --timeout=180s || echo "⚠️  PostgreSQL no está listo aún"
    sleep 10
    cd ..
else
    echo "⏭️  Saltando despliegue de base de datos"
fi

# 6. CONFIGMAPS
echo "📝 Creando ConfigMaps..."

cd ../base/configmaps
kubectl apply -f configmap-facele.yaml
kubectl apply -f configmap-ws-commands.yaml
echo "inicializando ws"
kubectl apply -f runtime-configmap.yaml
cd ..


# 7. DEPLOY SERVICIOS

cd ../base/services
echo "🚀 Desplegando servicios..."
kubectl apply -f ws-deployment.yaml
kubectl apply -f qp-deployment.yaml
kubectl apply -f qw-deployment.yaml

# 8. MONITOREO
echo "👀 Monitoreando (espera 2 minutos)..."
sleep 120
kubectl get all
kubectl get pods -o wide

echo ""
echo "✅ Despliegue completado!"
if [ "$DEPLOY_DB" = "true" ]; then
    echo "📊 Base de datos PostgreSQL desplegada"
    echo "   - Service: postgres-service:5432"
    echo "   - Database: facele_tpf"
fi
echo "🌐 Servicios disponibles:"
echo "   - WS: http://localhost:30073"
echo "   - QP: http://localhost:30081"
echo "   - QW: http://localhost:30082"

