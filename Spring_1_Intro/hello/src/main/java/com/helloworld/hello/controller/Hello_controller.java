package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class Hello_controller {
	
	@GetMapping ("/exercicio_1")
	public String hello() {
		return "Mentalidade de Crescimento, Persistência, Trabalho em Equipe, Atenção aos Detalhes";	
	}
	
	@GetMapping ("/exercicio_2")
	public String hello2() {
		return "Quero entender o spring boot!!!";	
	}

}
