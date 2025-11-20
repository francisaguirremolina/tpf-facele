#! /bin/bash

export HOST="https://wswhomo.afip.gov.ar/wsfexv1/service.asmx?op=FEXGetPARAM_MON"
# export HOST="https://wsfe-homo.arca.gob.ar/wsfexv1/service.asmx?op=FEXGetPARAM_MON"

curl --header "Content-Type: text/xml;charset=UTF-8" \
     --verbose -D - --data @13-wsfexMonedas.xml $HOST
echo


