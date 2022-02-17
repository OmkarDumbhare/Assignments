package com.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.User;

@RestController
@RequestMapping("check")
public class HomeController {

	User user = new User("Justin","James");
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {

        System.out.println(user);
        if (this.user.getUsername().equals(user.getUsername()) && this.user.getPassword().equals(user.getPassword())) {
            return "Valid User";
        }
        return "Invalid User";
    }
}
