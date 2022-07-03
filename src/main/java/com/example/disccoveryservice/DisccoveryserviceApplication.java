package com.example.disccoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DisccoveryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisccoveryserviceApplication.class, args);
	}

}
