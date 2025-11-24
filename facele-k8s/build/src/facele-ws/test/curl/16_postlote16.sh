#! /bin/bash

export HOST="http://localhost:8080/facele_ws/resources"
curl -D - -d @16_lote16.json $HOST/comprobantes/
echo


