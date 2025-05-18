package com.challenge.sinister_buster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SinisterBusterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SinisterBusterApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SinisterBusterApplication.class);
	}
}
