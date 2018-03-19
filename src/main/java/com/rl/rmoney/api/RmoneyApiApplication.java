package com.rl.rmoney.api;

import com.rl.rmoney.api.config.RMoneyApiProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RMoneyApiProperty.class)
public class RmoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RmoneyApiApplication.class, args);
	}
}
