FROM ubuntu:latest

MAINTAINER Ravi Ramamoorthy

RUN apt-get update && apt-get install -y openjdk-8-jdk

WORKDIR /usr/local/bin

COPY maven/healthcheck-server-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 9200

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar","--server.port=9200"]
