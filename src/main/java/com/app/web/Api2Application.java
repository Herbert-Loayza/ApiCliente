package com.app.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.web.entity.Cliente;
import com.app.web.repository.ClienteRepository;

@SpringBootApplication
public class Api2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Api2Application.class, args);
	}

	@Autowired
	private ClienteRepository repository;
	
	
	@Override
	public void run(String... args) throws Exception {
		/*Cliente cliente1 = new Cliente("Herbert", "Loayza", "loayza.herbert@gmail.com");
		repository.save(cliente1);
		
		Cliente cliente2 = new Cliente("Adriano", "Leite", "leite.adrian@gmail.com");
		repository.save(cliente2);
		*/
	}

}
