package br.com.luaazul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Bankline API", version = "0.0.1", description = "Bankline Information"))
public class ApiBanklineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBanklineApplication.class, args);
	}

}
