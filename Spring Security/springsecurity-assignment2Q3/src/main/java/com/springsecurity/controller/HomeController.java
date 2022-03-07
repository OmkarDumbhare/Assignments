package com.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

    @GetMapping("/admin")
    
    public String hellWorld() {
        return "Hello World!!";
    }

    @PostMapping("/login-fail")
    public String handleFailedLogin() {
        System.out.println("A User has failed to login");

        return "redirect:/signin?error";
    }
}
