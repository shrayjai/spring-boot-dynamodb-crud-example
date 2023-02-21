# Spring Boot DynamoDB CRUD [Example]

Spring Boot DynamoDB CRUD

## Setup

DynamoDB properties `/resources/application.properties`

```
aws.region=ap-south-1
aws.dynamoDB.endpoint=https://dynamodb.${aws.region}.amazonaws.com
aws.dynamoDB.accessKey=********
aws.dynamoDB.secretKey=********
```

Run locally

```
mvn spring-boot:run
```
