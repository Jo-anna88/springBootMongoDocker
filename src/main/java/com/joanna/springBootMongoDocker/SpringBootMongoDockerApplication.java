package com.joanna.springBootMongoDocker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootMongoDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDockerApplication.class, args);
	}

	////////////////////////////// for testing purposes //////////////////////////////
//	@Bean
//	CommandLineRunner runner(ProductRepository repo) {
//		return args -> {
//			Producer producer = new Producer("AppleCompany", "Poland");
//			Product product = new Product(ProductName.APPLE,3.50, 3, producer);
//			repo.insert(product);
//		};
//	}
}
