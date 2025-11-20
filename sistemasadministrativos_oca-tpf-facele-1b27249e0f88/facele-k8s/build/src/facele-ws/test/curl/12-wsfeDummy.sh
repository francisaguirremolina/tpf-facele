#! /bin/bash

#export HOST="https://wswhomo.afip.gov.ar/wsfev1/service.asmx?op=FEDummy"
export HOST="https://servicios1.afip.gov.ar/wsfev1/service.asmx?op=FEDummy"

curl --header "Content-Type: text/xml;charset=UTF-8" \
     --verbose -D - --data @12-request.xml $HOST
echo

#     --ciphers DEFAULT@SECLEVEL=1 \


