package com.secapi.seccode.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class IndexController {


	@GetMapping("/")
	public String apiIndex( ) {
		return "{  \"index\" : \"Main API index\" }";
	}

	@GetMapping("/name")
	public String getName(@RequestParam( name= "name", required = false, defaultValue = "World") String name ) {
		return "{  \"welcomeMessage\" : \"Welcome, " + upcaseName(name) + ", to a most secure API\" }";
	}

	private static String upcaseName(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

}

