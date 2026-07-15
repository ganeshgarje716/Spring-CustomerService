package com.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCustomerServiceApplication.class, args);
	}

}
