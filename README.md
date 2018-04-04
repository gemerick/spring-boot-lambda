# Spring boot

Sample Spring Boot application with a single REST API.

# Run

To build and run from a packaged jar locally:

    mvn spring-boot:run

or 

    mvn clean package
    java -jar target/spring-boot-lambda-1.0.0-SNAPSHOT.jar

# Docker

To build the image. First build the application, then build the docker image

    mvn package
    docker build -t spring-boot-lambda .
    
## Run

    docker run --name spring-boot-lambda -p 8080:8080 -d spring-boot-lambda
    
# Test

    curl http://localhost:8080/languages
