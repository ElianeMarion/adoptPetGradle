package br.com.adoptpet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.adoptpet.dataprovider.mapper",
		"br.com.adoptpet.config",

		"br.com.adoptpet.core",
		"br.com.adoptpet.dataprovider",
		"br.com.adoptpet.entrypoint"})
public class AdoptpetApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdoptpetApplication.class, args);
	}

}
