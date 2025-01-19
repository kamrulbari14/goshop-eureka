package com.kamrul.goshop.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GoshopEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoshopEurekaApplication.class, args);
	}

}
