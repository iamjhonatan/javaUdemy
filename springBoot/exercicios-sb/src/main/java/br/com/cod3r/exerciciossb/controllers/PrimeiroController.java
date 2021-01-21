package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//mapeando classes e metodos nas urls/ considerando a classe como uma api rest controller
@RestController
public class PrimeiroController {
	
	@GetMapping(path = {"/ola", "/saudacao"})
	// mapeando uma requisicao para esse metodo
	public String ola() {
		return "Olá SpringBoot!";
	}

}
