# Use lightweight Java image
FROM openjdk:11-jdk-slim

# Set working directory
WORKDIR /app

# Copy jar from target folder
COPY target/simple-java-app-1.0-SNAPSHOT.jar app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]
