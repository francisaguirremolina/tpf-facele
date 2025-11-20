#! /bin/bash

export HOST="https://wswhomo.afip.gov.ar/wsfexv1/service.asmx?op=FEXDummy"

curl --header "Content-Type: text/xml;charset=UTF-8" \
     --verbose -D - --data @17-request.xml $HOST
echo

#     --ciphers DEFAULT@SECLEVEL=1 \


