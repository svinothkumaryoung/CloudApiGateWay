package com.microservice.CloudAPI.CloudApiGateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
public class CloudApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApiGateWayApplication.class, args);
	}

}
