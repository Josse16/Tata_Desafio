FROM openjdk:8-alpine
#MAINTAINER Jose Ramirez
#RUN addgroup -S spring && adduser -S spring -G spring
#USER spring:spring
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} desafio-0.0.1-SNAPSHOT.jar
ADD target/desafio-0.0.1-SNAPSHOT.jar /usr/share/desafio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/desafio-0.0.1-SNAPSHOT.jar"]