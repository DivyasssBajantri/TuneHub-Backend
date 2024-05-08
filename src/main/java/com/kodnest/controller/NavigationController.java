package com.kodnest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class NavigationController {
	@GetMapping("/login")
	public String login() {
		return "login";
		
	}
	@GetMapping("/registration")
	public String registration() {
		return  "registration";
		
	}
	@GetMapping("/addsong")
	public String song() {
		return "song";
	}
	

}
