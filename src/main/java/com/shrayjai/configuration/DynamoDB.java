package com.shrayjai.configuration;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDB {

    @Value("${aws.dynamoDB.endpoint}")
    private String dynamoDBEndpoint;

    @Value("${aws.region}")
    private String awsRegion;

    @Value("${aws.dynamoDB.accessKey}")
    private String dynamoDBAccessKey;

    @Value("${aws.dynamoDB.secretKey}")
    private String dynamoDBSecretKey;

    @Bean
    public DynamoDBMapper dynamoDBMapper() {
        return new DynamoDBMapper(buildAmazonDynamoDB());
    }

    private AmazonDynamoDB buildAmazonDynamoDB() {
        return AmazonDynamoDBClientBuilder
            .standard()
            .withEndpointConfiguration(
                new AwsClientBuilder.EndpointConfiguration(dynamoDBEndpoint, awsRegion))
            .withCredentials(new AWSStaticCredentialsProvider(
                new BasicAWSCredentials(dynamoDBAccessKey, dynamoDBSecretKey)))
            .build();
    }
}
