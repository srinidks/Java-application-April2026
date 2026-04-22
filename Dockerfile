FROM openjdk:21
WORKDIR /app
COPY target/java-app.jar app.jar
CMD ["java", "-jar", "app.jar"]
