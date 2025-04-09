# Start from an OpenJDK base image
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy and build the JAR
COPY target/swe-bench-lite-api-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Start application
ENTRYPOINT ["java", "-jar", "app.jar"]
