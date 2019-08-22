FROM openjdk:8-jdk-alpine
LABEL maintainer="yankolyaspas@gmail.com"
EXPOSE 8083
ARG JAR_FILE=target/sservice-1.0.1.jar
ADD ${JAR_FILE} sservice.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/sservice.jar"]

