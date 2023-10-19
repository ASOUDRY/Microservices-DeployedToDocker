# Use a base image with Java 17 to run the Spring Boot app
FROM amazoncorretto:17

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Spring Boot JAR file into the container
COPY target/consumer-0.0.1-SNAPSHOT.jar /app/consumer.jar

# Copy the application.properties file
COPY src/main/resources/application.properties /app/application.properties

# Expose the port your Spring Boot app is running on (e.g., 8090)
EXPOSE 12000

# Define how to start your Spring Boot application
CMD ["java", "-jar", "consumer.jar"]