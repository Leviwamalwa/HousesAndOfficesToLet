package com.example.HousesAndOfficesToLet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class HousesAndOfficesToLetApplication extends SpringBootServletInitializer {
	protected SpringApplicationBuilder configurer(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(HousesAndOfficesToLetApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(HousesAndOfficesToLetApplication.class, args);
	}

}
