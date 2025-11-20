#! /bin/bash

export VERBOSE="-v"
# export VERBOSE=""

# Original Glassfish
keytool -list -keystore cacerts.jks $VERBOSE > cacerts.jks.list
# Tiene dos certificados: glassfish-instance y s1as
keytool -exportcert -alias glassfish-instance -keystore cacerts.jks -file glassfish-instance.crt -rfc -storepass changeit
keytool -exportcert -alias s1as -keystore cacerts.jks -file s1as.crt -rfc -storepass changeit


# Original Glassfish
# Este keystore es observado por keytool; se recomienda ejecutar:
# keytool -importkeystore -srckeystore keystore.jks -destkeystore keystore.jks -deststoretype pkcs12
keytool -list -keystore keystore.jks $VERBOSE > keystore.jks.list

# Original JDK-24
keytool -list -keystore cacerts $VERBOSE > cacerts.list


# Construcción del nuevo almacén
cp cacerts cacerts.new.jks
keytool -import -trustcacerts -alias glassfish-instance -file glassfish-instance.crt -keystore cacerts.new.jks
keytool -import -trustcacerts -alias s1as -file s1as.crt -keystore cacerts.new.jks


keytool -list -keystore cacerts.new.jks $VERBOSE > cacerts.new.jks.list
