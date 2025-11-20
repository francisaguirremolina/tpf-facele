# Se usa una imagen ligera de Java 21 para ejecutar la aplicación
FROM openjdk:21-jdk-slim
ARG JAR_QW
# ruta de copia:
WORKDIR /usr/src/app

COPY src/facele-qw/target/${JAR_QW} app.jar
# Copiamos las librerías de las que depende
COPY src/facele-qw/target/lib ./lib
COPY src/facele-qw/wsdl ./wsdl
CMD ["java", "-cp", "lib/*:app.jar", "com.epidata.facele.qw.FacEleQW"]
