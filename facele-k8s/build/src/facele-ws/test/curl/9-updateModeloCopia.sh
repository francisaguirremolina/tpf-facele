#! /bin/bash

export HOST="http://localhost:8080/facele_ws/resources"
curl --verbose -X PUT -D - -d @9-ModeloCopia.json $HOST/modelocopias/
echo


