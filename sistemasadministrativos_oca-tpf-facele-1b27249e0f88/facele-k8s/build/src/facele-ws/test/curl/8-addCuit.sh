#! /bin/bash

export HOST="http://localhost:8080/facele_ws/resources"
curl --verbose -D - -d @8-Cuit.json $HOST/cuits/
echo


