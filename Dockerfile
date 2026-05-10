FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/docker-jenkins-integration-sample.jar docker-jenkins-integration-sample.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","docker-jenkins-integration-sample.jar"]