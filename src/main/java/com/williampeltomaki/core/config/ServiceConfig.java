package com.williampeltomaki.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.williampeltomaki.service.CocktailService;

@Configuration
public class ServiceConfig {

	@Bean
	public CocktailService cocktailService() {
		return new CocktailService();
	}
	
}
