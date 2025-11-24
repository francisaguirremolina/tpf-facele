# Scripts de Despliegue Facele K8s

## build-all.sh

Script para construir imágenes Docker y desplegar la aplicación Facele en Kubernetes.

### Uso

```bash
./build-all.sh [-e|--environment <env>] [-db|--database <true|false>]
```

### Parámetros

- `-e, --environment <env>`: Especifica el ambiente de despliegue (por defecto: `dev`)
  - Valores: `dev`, `prod`, `staging`, etc.
  
- `-db, --database <true|false>`: Controla si se despliega la base de datos PostgreSQL
  - `true`: Despliega PostgreSQL junto con los servicios
  - `false`: Solo despliega los servicios de aplicación (por defecto)

### Ejemplos

#### Despliegue básico sin base de datos
```bash
./build-all.sh
```

#### Despliegue con base de datos en desarrollo
```bash
./build-all.sh -e dev -db true
```

#### Despliegue sin base de datos en producción
```bash
./build-all.sh -e prod -db false
```

#### Solo especificando la base de datos
```bash
./build-all.sh -db true
```

### Servicios Desplegados

El script despliega los siguientes servicios:

- **facele-ws**: Web Service (Puerto: 30073, Admin: 31573)
- **facele-qp**: Queue Processor (Puerto: 30081)
- **facele-qw**: Queue Writer (Puerto: 30082)
- **postgres** (opcional): Base de datos PostgreSQL (Puerto interno: 5432)

### Acceso a los Servicios

Después del despliegue, puedes acceder a:

- WS: http://localhost:30073
- WS Admin: http://localhost:31573
- QP: http://localhost:30081
- QW: http://localhost:30082

### Base de Datos

Cuando se despliega con `-db true`:

- **Service Name**: `postgres-service`
- **Port**: 5432
- **Database**: `facele_tpf`
- **User**: `sa`
- **Password**: Definido en `postgres-secret.yaml`

Los servicios se conectan automáticamente a la base de datos usando las variables de entorno configuradas en los deployments.

### Flujo de Despliegue

1. **Parse de argumentos**: Procesa flags `-e` y `-db`
2. **Build de imágenes Docker**: Construye las imágenes para WS, QP y QW
3. **Limpieza de Kubernetes**: Elimina recursos existentes
4. **Deploy de PostgreSQL** (opcional): Si `-db true`, despliega la base de datos
5. **ConfigMaps**: Crea/actualiza los ConfigMaps necesarios
6. **Deploy de servicios**: Despliega WS, QP y QW
7. **Monitoreo**: Espera 2 minutos y muestra el estado de los pods

### Notas

- El script requiere que exista un archivo `.env` en el directorio con las variables necesarias
- Las imágenes Docker se reconstruyen en cada ejecución para asegurar que se usen los últimos cambios
- El script utiliza `imagePullPolicy: Never` para usar imágenes locales

### Troubleshooting

Si los pods no inician correctamente:

```bash
# Ver logs de un pod específico
kubectl logs <pod-name>

# Ver eventos
kubectl get events --sort-by='.lastTimestamp'

# Verificar estado de los pods
kubectl get pods -o wide
```

Para limpiar completamente el cluster:

```bash
./cleanup.sh
```

---

## cleanup.sh

Script para limpiar recursos de Facele del cluster de Kubernetes.

### Uso

```bash
./cleanup.sh [-e|--environment <env>] [-n|--namespace <ns>] [-f|--force] [-db|--database]
```

### Parámetros

- `-e, --environment <env>`: Especifica el ambiente (por defecto: `dev`)
  - Valores: `dev`, `staging`, `prod`
  
- `-n, --namespace <ns>`: Namespace de Kubernetes (por defecto: `default`)
  
- `-f, --force`: Fuerza la eliminación sin confirmación

- `-db, --database`: También elimina los recursos de la base de datos PostgreSQL
  - **ADVERTENCIA**: Esto eliminará permanentemente todos los datos de la base de datos

- `-h, --help`: Muestra ayuda

### Ejemplos

#### Limpiar solo la aplicación (mantiene la base de datos)
```bash
./cleanup.sh
```

#### Limpiar aplicación y base de datos
```bash
./cleanup.sh -db
```

#### Limpiar sin confirmación (útil para scripts)
```bash
./cleanup.sh -f
```

#### Limpiar todo sin confirmación
```bash
./cleanup.sh -db -f
```

### Recursos Eliminados

#### Por defecto (sin `-db`):
- Deployments: `facele-ws`, `facele-qp`, `facele-qw`
- Services: `facele-ws-service`, `facele-qp-service`, `facele-qw-service`
- ConfigMaps: `facele-config`, `ws-post-boot-commands`, `runtime-configmap`

#### Con flag `-db`:
- Todo lo anterior, más:
- Deployment: `postgres`
- Services: `postgres-service`, `postgres-headless`, `facele-db`
- Secret: `postgres-secret`
- ConfigMap: `postgres-init-scripts`
- PersistentVolumeClaim: `postgres-pvc` (⚠️ elimina todos los datos)

### Comportamiento

1. **Confirmación interactiva**: Por defecto, el script pedirá confirmación antes de eliminar recursos (a menos que uses `-f`)
2. **Mantiene la base de datos**: Por defecto, solo elimina la aplicación y mantiene PostgreSQL corriendo
3. **Muestra recursos restantes**: Al final del proceso, muestra los pods que aún están terminando

### Notas Importantes

⚠️ **ADVERTENCIA**: Usar `-db` eliminará PERMANENTEMENTE todos los datos de la base de datos PostgreSQL. Esta acción no se puede deshacer.

- El script valida la conexión al cluster antes de comenzar
- Usa colores para distinguir información (verde), advertencias (amarillo) y errores (rojo)
- Es seguro ejecutar múltiples veces (usa `--ignore-not-found=true`)
