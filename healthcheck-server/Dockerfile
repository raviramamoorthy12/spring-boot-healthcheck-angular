FROM openjdk:8-jdk-alpine

MAINTAINER Ravi Ramamoorthy

COPY target/healthcheck-0.0.1-SNAPSHOT.jar /var/www/app.jar

WORKDIR /var/www

EXPOSE 9200

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/var/www/app.jar","--server.port=9200"]
