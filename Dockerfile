FROM maven:3.3-jdk-8
COPY src /apitesting/restassured/src
COPY pom.xml /apitesting/restassured/pom.xml
WORKDIR /apitesting/restassured 
ENTRYPOINT mvn clean test