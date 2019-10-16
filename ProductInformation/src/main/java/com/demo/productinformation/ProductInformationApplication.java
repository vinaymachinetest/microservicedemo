package com.demo.productinformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.demo" })
@EnableEurekaClient
public class ProductInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductInformationApplication.class, args);
	}

}
