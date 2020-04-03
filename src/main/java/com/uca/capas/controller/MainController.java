package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;


@Controller
public class MainController {
	
	@GetMapping("/agregarUsuario")
	public String enviarForm(Usuario usuario) {
		return "agregarUsuario";
	}
	
	@PostMapping("/validacion")
	public String provesarForm(Usuario usuario) {
		if(usuario.getPassword().equals("admin") && usuario.getUsername().equals("admin")) {
			return "MostrarMensajeV";
			
		}else {
			return "MostrarMensajeF";
		}
		
	}
	
	
}