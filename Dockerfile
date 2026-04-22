FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY target/java-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
