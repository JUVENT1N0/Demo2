package com.JUV3.ejercicio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String Saludo() {
		return "ejemplo";
	}
	
	@GetMapping("/Ejemplo1")
	public String Ejemplo1() {
		return "ejemplo1";
	}
	
	@GetMapping("/Portada")
		public String Portada() {
			return "Portada";
		}
	}

