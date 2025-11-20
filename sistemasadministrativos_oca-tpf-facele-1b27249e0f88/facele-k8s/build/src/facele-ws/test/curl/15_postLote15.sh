#! /bin/bash

export HOST="http://localhost:8080/facele_ws/resources"
curl -D - -d @15_lote15.json $HOST/comprobantes/
echo


