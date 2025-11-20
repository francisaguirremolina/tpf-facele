#! /bin/bash

export HOST="http://localhost:8080/facele_ws/resources"
curl -D - -d @14_lote14.json $HOST/comprobantes/
echo


