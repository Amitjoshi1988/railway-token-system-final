FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/db-service-*.jar app.jar
EXPOSE 8097
ENTRYPOINT ["java", "-jar", "app.jar"]
