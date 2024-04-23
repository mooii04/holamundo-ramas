package com.salesianostriana.dam.ramas.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping ("/")
	public String saidHello () {
		return "index.html";
	}
	
}
