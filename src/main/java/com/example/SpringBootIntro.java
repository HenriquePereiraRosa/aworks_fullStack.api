package com.example;

import com.example.config.property.ApiProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@SpringBootApplication
@EnableOAuth2Client
@EnableAutoConfiguration
@EnableConfigurationProperties(ApiProperty.class)
@EntityScan( basePackages = {"model"} )
public class SpringBootIntro {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntro.class, args);
	}
}
