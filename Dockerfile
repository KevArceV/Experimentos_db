FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/Connection2Connection-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} c2c.jar
ENTRYPOINT ["java","-jar","/c2c.jar"]