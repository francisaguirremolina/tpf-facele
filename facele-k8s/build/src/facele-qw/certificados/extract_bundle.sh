#! /bin/bash

echo Extrayendo private key con password...
echo Use "1234" como "Import Password"
echo Use "1234" como "PEM pass phrase"
openssl pkcs12 -in ocaDesa.pfx -nocerts -out privada_OCA_homo_withpass.key

echo Extrayendo certificado... ------------
echo Use "1234" como "Import Password"
echo Luego quite las primeras cuatro líneas del archivo OCA_homo.crt
openssl pkcs12 -in ocaDesa.pfx -clcerts -nokeys -out OCA_homo.crt

echo Quitando password a private key... ------------
echo Use "1234" como pass phrase for...
openssl rsa -in privada_OCA_homo_withpass.key -out privada_OCA_homo.key

echo Borrando la private key con password... -----------
rm -f privada_OCA_homo_withpass.key

echo Finalizado. ------------------------
