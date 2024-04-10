package com.mscode.supremaciabr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.mscode.entity"})
public class SupremaciabrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupremaciabrApplication.class, args);
	}

}
