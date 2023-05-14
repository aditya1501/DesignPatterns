package com.adii.designpatterns;

import com.adii.designpatterns.StrategyPattern.DuckService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignpatternsApplication {


	public static void main(String[] args) {
		SpringApplication.run(DesignpatternsApplication.class, args);
		DuckService duckService = new DuckService();
		duckService.createDuck();
	}

}
