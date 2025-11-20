#! /bin/bash

export HOST="http://localhost:8080/facele_ws/resources"
curl -D - -X DELETE --verbose $HOST/puntosventa/4



