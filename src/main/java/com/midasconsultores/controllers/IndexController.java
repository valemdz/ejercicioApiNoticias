package com.midasconsultores.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping( { "","/" })
	public String index() {
		return  "Api de Noticias:"
				.concat( "<br>")
				.concat("<a href='/swagger-ui.html' >Documentacion </a>" );
		
	}
}
