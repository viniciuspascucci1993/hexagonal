package com.pascucci.Hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HexagonalApplication {

	/* START APPLICATION - Hexagonal Architteture*/
	public static void main(String[] args) {
		SpringApplication.run(HexagonalApplication.class, args);
	}

}
