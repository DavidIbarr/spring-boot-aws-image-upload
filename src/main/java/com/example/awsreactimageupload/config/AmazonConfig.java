package com.example.awsreactimageupload.config;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
//    public AmazonS3 s3() {
//        return AmazonS3ClientBuilder.defaultClient();
//    }
    public AmazonS3 s3() {
        AmazonS3 AmazonS3 = null;
        return AmazonS3;
    }
}
