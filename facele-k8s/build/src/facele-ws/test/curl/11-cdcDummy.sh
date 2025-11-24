#! /bin/bash

export HOST="https://wswhomo.afip.gov.ar/WSCDC/service.asmx?op=ComprobanteDummy"

# export HOST="https://servicios1.afip.gov.ar/WSCDC/service.asmx?op=ComprobanteDummy?op=ComprobanteDummy"

curl --verbose -D - -d @11-request.xml $HOST
echo


