FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/docker-jenkins-integration.jar docker-jenkins-integration.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","docker-jenkins-integration.jar"]