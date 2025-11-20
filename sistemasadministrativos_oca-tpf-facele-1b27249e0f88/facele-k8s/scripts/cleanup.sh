#!/bin/bash

# FacEle Kubernetes Cleanup Script
# This script removes FacEle resources from Kubernetes

set -euo pipefail

ENVIRONMENT="dev"
NAMESPACE="default"
FORCE="false"
CLEAN_DB="false"

# Colors for output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

usage() {
    cat << EOF
Usage: $0 [OPTIONS]

Clean up FacEle application resources from Kubernetes

OPTIONS:
    -e, --environment ENV    Target environment (dev, staging, prod) [default: dev]
    -n, --namespace NS      Kubernetes namespace [default: default]
    -f, --force             Force deletion without confirmation
    -db, --database         Also delete PostgreSQL database resources
    -h, --help             Show this help message

EXAMPLES:
    $0                           # Clean up application only (keep database)
    $0 -db                       # Clean up application and database
    $0 -e prod -f                # Force clean up production (be careful!)
    $0 -db -f                    # Force clean up everything including database
EOF
}

log() {
    echo -e "${GREEN}[INFO]${NC} $*"
}

warn() {
    echo -e "${YELLOW}[WARN]${NC} $*"
}

error() {
    echo -e "${RED}[ERROR]${NC} $*" >&2
    exit 1
}

confirm() {
    if [[ "$FORCE" == "true" ]]; then
        return 0
    fi
    
    local msg="Are you sure you want to delete all FacEle resources in $ENVIRONMENT environment"
    if [[ "$CLEAN_DB" == "true" ]]; then
        msg="$msg (including database)"
    fi
    msg="$msg? (y/N): "
    
    read -p "$msg" -n 1 -r
    echo
    if [[ ! $REPLY =~ ^[Yy]$ ]]; then
        log "Operation cancelled"
        exit 0
    fi
}

cleanup_app() {
    log "Cleaning up FacEle application resources..."
    
    # Delete application deployments and services
    kubectl delete deployment facele-ws facele-qp facele-qw -n "$NAMESPACE" --ignore-not-found=true 2>/dev/null || true
    kubectl delete service facele-ws-service facele-qp-service facele-qw-service -n "$NAMESPACE" --ignore-not-found=true 2>/dev/null || true
    
    # Delete ConfigMaps
    kubectl delete configmap facele-config ws-post-boot-commands runtime-configmap -n "$NAMESPACE" --ignore-not-found=true 2>/dev/null || true
    
    log "Application resources cleaned up"
}

cleanup_database() {
    log "Cleaning up PostgreSQL database resources..."
    
    # Delete PostgreSQL deployment and services
    kubectl delete deployment postgres -n "$NAMESPACE" --ignore-not-found=true 2>/dev/null || true
    kubectl delete service postgres-service postgres-headless facele-db -n "$NAMESPACE" --ignore-not-found=true 2>/dev/null || true
    
    # Delete secrets and ConfigMaps
    kubectl delete secret postgres-secret -n "$NAMESPACE" --ignore-not-found=true 2>/dev/null || true
    kubectl delete configmap postgres-init-scripts -n "$NAMESPACE" --ignore-not-found=true 2>/dev/null || true
    
    # Delete PVC (this will delete the data!)
    warn "Deleting PersistentVolumeClaim - all database data will be lost!"
    kubectl delete pvc postgres-pvc -n "$NAMESPACE" --ignore-not-found=true 2>/dev/null || true
    
    log "Database resources cleaned up"
}

# Parse command line arguments
while [[ $# -gt 0 ]]; do
    case $1 in
        -e|--environment)
            ENVIRONMENT="$2"
            shift 2
            ;;
        -n|--namespace)
            NAMESPACE="$2"
            shift 2
            ;;
        -f|--force)
            FORCE="true"
            shift
            ;;
        -db|--database)
            CLEAN_DB="true"
            shift
            ;;
        -h|--help)
            usage
            exit 0
            ;;
        *)
            error "Unknown option: $1"
            ;;
    esac
done

# Validate environment
case $ENVIRONMENT in
    dev|staging|prod)
        ;;
    *)
        error "Invalid environment: $ENVIRONMENT. Must be one of: dev, staging, prod"
        ;;
esac

# Main execution
main() {
    log "Starting FacEle cleanup for $ENVIRONMENT environment"
    
    if ! kubectl cluster-info &> /dev/null; then
        error "Cannot connect to Kubernetes cluster"
    fi
    
    # Show what will be deleted
    log "Resources to be deleted:"
    log "  - FacEle application (WS, QP, QW)"
    log "  - ConfigMaps and Secrets"
    if [[ "$CLEAN_DB" == "true" ]]; then
        warn "  - PostgreSQL database (including all data!)"
    fi
    echo ""
    
    confirm
    
    # Clean up application
    cleanup_app
    
    # Clean up database if requested
    if [[ "$CLEAN_DB" == "true" ]]; then
        cleanup_database
    else
        log "Keeping PostgreSQL database (use -db flag to delete)"
    fi
    
    # Wait for resources to be deleted
    log "Waiting for resources to be fully deleted..."
    sleep 5
    
    # Show remaining resources
    log "Remaining pods in namespace $NAMESPACE:"
    kubectl get pods -n "$NAMESPACE" 2>/dev/null || log "No pods found"
    
    log "Cleanup process completed successfully"
}

# Run main function
main