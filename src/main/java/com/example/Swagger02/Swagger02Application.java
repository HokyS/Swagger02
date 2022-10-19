package com.example.Swagger02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Swagger02Application {

	public static void main(String[] args) {
		SpringApplication.run(Swagger02Application.class, args);
	}

}
