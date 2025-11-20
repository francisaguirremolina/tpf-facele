# FacEle Kubernetes Deployment

Este directorio contiene la configuración de Kubernetes para desplegar la suite de aplicaciones FacEle, organizada siguiendo las mejores prácticas de Kubernetes y utilizando Kustomize para la gestión de configuraciones.

## 📁 Estructura del Proyecto

```
facele-k8s-organized/
├── base/                           # Configuración base común
│   ├── namespace/                  # Namespace y NetworkPolicy
│   ├── database/                   # PostgreSQL configuración y .dump semilla 
│   ├── services/                   # Deployments de servicios
│   ├── configmaps/                 # ConfigMaps compartidos
│   ├── secrets/                    # Secrets de base de datos
│   └── kustomization.yaml          # Kustomization base
├── overlays/                       # Configuraciones específicas por entorno
│   ├── dev/                        # Desarrollo
│   ├── staging/                    # Staging/QA
│   └── prod/                       # Producción
├── scripts/                        # Scripts de despliegue y utilidades
│   ├── build-all.sh                   # Script principal de despliegue
│   └── cleanup.sh                  # Script de limpieza
├── build/                          # Dockerfiles 
|   ├──src                          # Fuentes
|      ├──facele-common             # Fuentes comunes
|      ├──facele-qp                 # servicio Cola QP
|      ├──facele-qw                 # servicio Cola QW
|      ├──facele-ws                 # Servicio glasfish
└── docs/                           # Documentación adicional
```

## 🚀 Inicio Rápido

### Prerrequisitos

- [kubectl](https://kubernetes.io/docs/tasks/tools/) instalado y configurado
- [kustomize](https://kustomize.io/) instalado
- [Docker](https://www.docker.com/) (si necesitas construir imágenes)
- Acceso a un cluster de Kubernetes
- configurar configmap-facele.yaml con las crendenciales necesarias, bd(L26), respuesta de tpf(L93 y L98), servicio minio(L163)
- correr script semilla (postsql.dump) en el servicio RDS,que contiene la estructura de base de datos necesaria para facele

### Despliegue Básico

1. **Desplegar en desarrollo:**
   ```bash
   ./scripts/build-all.sh -e dev
   ```

2. **Construir imágenes y desplegar:**
   ```bash
   ./scripts/build-all.sh -e dev -b
   ```



## 🏗️ Arquitectura de la Aplicación

La aplicación FacEle se compone de los siguientes servicios:

### Servicios Principales

1. **PostgreSQL Database** (`facele-db`)
   - Base de datos principal del sistema
   - Puerto: 5432
   - Persistencia: Configurada por entorno

2. **Web Service** (`facele-ws`)
   - Servidor principal GlassFish
   - API REST expuesta
   - Puertos: 8080 (HTTP), 4848 (Admin)

3. **PDF Queue Processor** (`facele-qp`)
   - Procesa cola de generación de PDFs y QR
   - Aplicación de consola Java

4. **Authorization Queue Processor** (`facele-qw`)
   - Gestiona autorización con ARCA
   - Aplicación de consola Java

### Configuración Centralizada

La aplicación utiliza un archivo `facele.properties` centralizado que contiene:
- Configuración de base de datos
- Endpoints de servicios ARCA (WSAA, WSFE, WSCDC, WSFEX)
- Configuración de almacenamiento S3/MinIO
- Parámetros de logging y debugging

## 🎯 Entornos

### Desarrollo (dev)
- **Réplicas**: 1 para todos los servicios
- **Recursos**: Limitados para desarrollo local
- **Servicios**: NodePort para fácil acceso
- **Debug**: Activado

### Staging
- **Réplicas**: 2 para servicios críticos
- **Recursos**: Moderados
- **Servicios**: LoadBalancer interno
- **Debug**: Limitado

### Producción (prod)
- **Réplicas**: 3+ para alta disponibilidad
- **Recursos**: Completos según demanda
- **Servicios**: LoadBalancer con SSL
- **Debug**: Desactivado
- **Endpoints**: Servicios AFIP de producción

## 🔧 Comandos Útiles

### Despliegue

```bash
# Desplegar en desarrollo
./scripts/build-all.sh -e dev

# Despliegue con construcción de imágenes
./scripts/build-all.sh -e dev -b


# Desplegar en namespace específico
./scripts/build-all.sh -e dev -n mi-namespace
```

### Monitoreo

```bash
# Ver estado de los pods
kubectl get pods -n facele

# Ver logs de un servicio
kubectl logs -f deployment/facele-ws -n facele

# Ver servicios y endpoints
kubectl get svc,endpoints -n facele

# Ver configuraciones
kubectl get configmaps,secrets -n facele
```

### Limpieza

```bash
# Limpiar entorno de desarrollo
./scripts/cleanup.sh -e dev

# Limpieza forzada (sin confirmación)
./scripts/cleanup.sh -e dev -f
```

### Debugging

```bash
# Conectar a un pod
kubectl exec -it deployment/facele-ws -n facele -- /bin/bash

# Port forwarding para acceso local
kubectl port-forward svc/facele-ws-service 8080:8080 -n facele

# Ver eventos del namespace
kubectl get events -n facele --sort-by=.metadata.creationTimestamp
```

## 🔐 Seguridad

### Secrets Management

- Las credenciales de base de datos se almacenan en Kubernetes Secrets
- Los certificados SSL se montan desde ConfigMaps
- Variables de entorno sensibles no se exponen en logs

### Network Policies

Se implementan políticas de red para:
- Restricción de tráfico entre pods
- Acceso controlado a la base de datos
- Comunicación segura entre servicios

## 📊 Monitoreo y Logging

### Health Checks

Cada servicio incluye:
- **Liveness Probe**: Verifica que el servicio esté funcionando
- **Readiness Probe**: Verifica que el servicio esté listo para recibir tráfico
- **Startup Probe**: Maneja el tiempo de inicio de aplicaciones pesadas

### Logging

- Logs centralizados usando stdout/stderr
- Configuración de nivel de log por entorno
- Rotación automática de logs

## 🚨 Troubleshooting

### Problemas Comunes

1. **Pods en estado CrashLoopBackOff**
   ```bash
   kubectl describe pod <pod-name> -n facele
   kubectl logs <pod-name> -n facele --previous
   ```

2. **Problemas de conectividad a base de datos**
   ```bash
   kubectl exec -it deployment/facele-ws -n facele -- ping postgres-service
   ```

3. **ConfigMaps no actualizados**
   ```bash
   kubectl rollout restart deployment/facele-ws -n facele
   ```

### Logs de Servicios Específicos

- **Web Service**: Logs de GlassFish en `/opt/glassfish7/glassfish/domains/domain1/logs/`
- **Queue Processors**: Logs de aplicación en stdout

## 🔄 CI/CD Integration

El proyecto está preparado para integración con sistemas CI/CD:

1. **Pipeline de construcción**: Usa `build/` para Dockerfiles
2. **Despliegue automatizado**: Usa `scripts/build-all.sh` 
3. **Rollback**: Fácil rollback usando Kubernetes deployments

## 📋 Checklist de Despliegue

Antes de desplegar en producción:

- [ ] Verificar configuración de endpoints AFIP
- [ ] Validar certificados SSL
- [ ] Confirmar configuración de base de datos
- [ ] Verificar recursos y límites
- [ ] Probar conectividad S3/MinIO
- [ ] Validar secrets y configmaps
- [ ] Ejecutar dry-run
- [ ] Verificar backup de base de datos


## 📚 Referencias

- [Kustomize Documentation](https://kustomize.io/)
- [Kubernetes Documentation](https://kubernetes.io/docs/)
- [Best Practices for Kubernetes](https://kubernetes.io/docs/concepts/configuration/overview/)
- [12-Factor App Methodology](https://12factor.net/)