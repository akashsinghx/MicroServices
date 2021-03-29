package com.ltts.ShopInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ShopInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopInfoApplication.class, args);
	}

	@Bean
	/* @LoadBalanced */
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

