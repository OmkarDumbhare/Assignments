package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.rest.service.CardService;

@RestController
public class CardController {

	@Autowired
	private CardService service;
	
	 @GetMapping(path = "/credit-card/{id}")
	    public String creditCard(@PathVariable("id") long number) {
	        boolean ans = service.isValid(number);

	        if (ans == true) {
	            return "Credit card is valid";
	        }
	        return "Credit card is not valid";
	    }
	
	
}
