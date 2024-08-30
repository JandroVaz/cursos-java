package com.cursoRestFull.cursoRestFull;

import com.cursoRestFull.cursoRestFull.controller.ProfesorRestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ProfesorRestController")
public class CursoRestFullApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoRestFullApplication.class, args);
	}

}
