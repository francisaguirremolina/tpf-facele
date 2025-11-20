#! /bin/bash

export HOST="http://localhost:8080/facele_ws/resources"
curl -D - -d @4-quewedone.json $HOST/colas/qw/DONE
echo


