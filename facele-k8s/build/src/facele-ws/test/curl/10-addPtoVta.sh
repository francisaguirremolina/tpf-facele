#! /bin/bash

export HOST="http://localhost:8080/facele_ws/resources"
curl --verbose -D - -d @10-PtoVta.json $HOST/puntosventa/
echo


