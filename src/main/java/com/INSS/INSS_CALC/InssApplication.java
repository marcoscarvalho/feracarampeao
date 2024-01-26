package com.INSS.INSS_CALC;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InssApplication {

	public static void main(String[] args) {

		SpringApplication.run(InssApplication.class, args);
	}
	@Bean
	public CommandLineRunner initialization(){
		return args -> {
			System.out.println("Teste configurando Spring Boot no Intelijj");
		};
    }

}
