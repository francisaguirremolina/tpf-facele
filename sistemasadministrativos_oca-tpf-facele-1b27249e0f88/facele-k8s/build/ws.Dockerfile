FROM eclipse-temurin:21-jdk

RUN apt-get update && apt-get install -y wget unzip && rm -rf /var/lib/apt/lists/*

ARG GF_VERSION=7.0.15
ARG JAR_WS
RUN wget https://github.com/eclipse-ee4j/glassfish/releases/download/${GF_VERSION}/glassfish-${GF_VERSION}.zip && \
    unzip glassfish-${GF_VERSION}.zip -d /opt && \
    rm glassfish-${GF_VERSION}.zip

ENV GLASSFISH_HOME /opt/glassfish7


COPY src/facele-ws/target/${JAR_WS} $GLASSFISH_HOME/glassfish/domains/domain1/autodeploy/facele_ws.war
# copiar controlador postgresql
COPY src/facele-ws/target/lib   ./opt/glassfish7/glassfish/domains/domain1/lib/
COPY src/facele-ws/wsdl ./opt/glassfish7/glassfish/domains/domain1/config/wsdl/
COPY src/facele-common/cacerts.jks ./opt/glassfish7/glassfish/domains/domain1/config/
COPY src/facele-common/keystore.jks ./opt/glassfish7/glassfish/domains/domain1/config/
#COPY src.docker-entrypoint.sh ./docker-entrypoint.sh
#RUN chmod +x ./docker-entrypoint.sh

#RUN ./docker-entrypoint.sh


EXPOSE 8080 4848

CMD ["/opt/glassfish7/bin/asadmin", "start-domain", "--verbose", "domain1"]