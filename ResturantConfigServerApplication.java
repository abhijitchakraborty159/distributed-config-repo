package com.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ResturantConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResturantConfigServerApplication.class, args);
	}

}
