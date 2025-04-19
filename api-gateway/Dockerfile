# Use a lightweight Java runtime image
FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the jar from the target directory
COPY target/api-gateway-*.jar app.jar

EXPOSE 8084

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
