package br.com.petz.clientepet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePetApplication {
	
	public String getHomeTest() {
		return "Cliente pet - API Home";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientePetApplication.class, args);
	}

}
