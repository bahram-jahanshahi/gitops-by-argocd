FROM openjdk:17
ARG JAR_FILE=target/GitOpsByArgoCD-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} GitOpsByArgoCD.jar
ENTRYPOINT ["java", "-jar", "GitOpsByArgoCD.jar"]
EXPOSE 8686