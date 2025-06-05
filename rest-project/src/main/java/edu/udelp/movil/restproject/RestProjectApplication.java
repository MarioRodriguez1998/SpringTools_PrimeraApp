package edu.udelp.movil.restproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RestProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestProjectApplication.class, args);
	}

}
