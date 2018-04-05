# Spring boot with AWS Lambda

Sample application to demonstrate running a Spring Boot application as an AWS Lambda built with Cloud formation.

# AWS Lambda

Build the code and deploy with AWS SAM.

mvn clean package

aws cloudformation package --template-file sam.yaml --output-template-file target/output-sam.yaml --s3-bucket lambda-cfn
 
aws cloudformation deploy --template-file target/output-sam.yaml --stack-name spring-boot-lambda --capabilities CAPABILITY_IAM
 
aws cloudformation describe-stacks --stack-name spring-boot-lambda


# Run

To build and run from a packaged jar locally:

    mvn spring-boot:run

or 

    mvn clean package -Dboot
    java -jar target/spring-boot-lambda-1.0.0-SNAPSHOT.jar

# Docker

To build the image. First build the application, then build the docker image

    mvn package -Dboot
    docker build -t spring-boot-lambda .
    
## Run

    docker run --name spring-boot-lambda -p 8080:8080 -d spring-boot-lambda
    
# Test

    curl http://localhost:8080/languages
