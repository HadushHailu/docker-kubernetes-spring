# Start with a base image containing Java runtime
FROM openjdk:21-jdk-slim as build

# Add Maintainer Info
LABEL maintainer="had.hailu@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=target/mySearchEngine-docker-k8s-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} serach-engine-app.jar

# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/serach-engine-app.jar"]