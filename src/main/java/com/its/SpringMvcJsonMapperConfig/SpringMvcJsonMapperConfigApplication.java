package com.its.SpringMvcJsonMapperConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;

@SpringBootApplication (exclude = {JacksonAutoConfiguration.class, GsonAutoConfiguration.class})
public class SpringMvcJsonMapperConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcJsonMapperConfigApplication.class, args);
	}

}
