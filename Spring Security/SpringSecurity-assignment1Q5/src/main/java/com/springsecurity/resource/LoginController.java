package com.springsecurity.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
}
