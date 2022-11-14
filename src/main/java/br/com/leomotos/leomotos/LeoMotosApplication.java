package br.com.leomotos.leomotos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class LeoMotosApplication {
	
	@GetMapping
	public String getHomeTeste() {
		return "Leo Motos Teste ok";
	}
	public static void main(String[] args) {
		SpringApplication.run(LeoMotosApplication.class, args);
	}
}
