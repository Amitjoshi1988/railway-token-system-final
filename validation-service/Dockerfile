FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/validation-service-*.jar app.jar
EXPOSE 9092
ENTRYPOINT ["java", "-jar", "app.jar"]
