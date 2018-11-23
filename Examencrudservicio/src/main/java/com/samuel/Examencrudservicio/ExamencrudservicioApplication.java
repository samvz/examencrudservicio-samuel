package com.samuel.Examencrudservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableAutoConfiguration
@EnableJpaRepositories("com.samuel.repository")
@ComponentScan({"com.samuel.controller","com.samuel.service"})
@EntityScan("com.samuel.modell")

@SpringBootApplication
public class ExamencrudservicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamencrudservicioApplication.class, args);
	}
}
