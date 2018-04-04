FROM openjdk:8-jdk-alpine

ADD target/spring-boot*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar" ]
