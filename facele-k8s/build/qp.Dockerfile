# Se usa una imagen ligera de Java 21 para ejecutar la aplicación
FROM openjdk:21-jdk-slim
ARG JAR_QP

RUN apt-get update && apt-get install -y libfreetype6 fontconfig fonts-dejavu-core && rm -rf /var/lib/apt/lists/*

WORKDIR /usr/src/app

COPY src/facele-qp/target/${JAR_QP} app.jar
# Copiamos las librerías de las que depende
COPY src/facele-qp/target/lib ./lib

CMD ["java", "-cp", "lib/*:app.jar", "com.epidata.facele.qp.FacEleQP"]
