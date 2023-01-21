# Spring Boot DynamoDB CRUD [Example]

Example code for Spring Boot DynamoDB CRUD.

## Run locally

DynamoDB properties are under `/resources/application.properties`.  

```
aws.region=ap-south-1
aws.dynamoDB.endpoint=https://dynamodb.${aws.region}.amazonaws.com
aws.dynamoDB.accessKey=********
aws.dynamoDB.secretKey=********
```

Run the project in an IDE or by this command on the command line:

```
mvn spring-boot:run
```
