package com.mywork.JavaSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	Car getCar() {
		return new Car(getEngine());
	}

	@Bean
	Engine getEngine() {
		return new Engine();
	}
}
