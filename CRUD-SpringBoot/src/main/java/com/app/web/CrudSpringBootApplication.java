package com.app.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
     
	
	
	@Override
	public void run(String... args) throws Exception {

		/*
		 Estudiante estudiante1 = new Estudiante("Michael","Luna","rotamero@hotmail.com");
		  repositorio.save(estudiante1);
		  
		 Estudiante estudiante2 = new Estudiante("Romulo","Abad","ro123tameros@hotmail.com");
		 repositorio.save(estudiante2);
		 
		 Estudiante estudiante3 = new Estudiante("Ramón ", "Jimenez", "Jimenez12@hotmail.com");
		 repositorio.save(estudiante3);
		 */

	}

}
