package com.secapi.seccode.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingController {

	@GetMapping("/")
	public String index() {
		return "Hello world";
	}

}
