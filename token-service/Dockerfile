FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/token-service-*.jar app.jar
EXPOSE 9091
ENTRYPOINT ["java", "-jar", "app.jar"]
