package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.service.Service;



@Controller
@ResponseBody
public class CalcController {

	@Autowired
	private Service service;

	  @GetMapping("/add/{num1}/{num2}")
	    public int Addition(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
	        return service.Addition(num1, num2);
	    }

	    @GetMapping("/sub/{num1}/{num2}")
	    public int Subtraction(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
	        return service.subtraction(num1, num2);
	    }

	    @GetMapping("/mul/{num1}/{num2}")
	    public int Multiplication(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
	        return service.multiplication(num1, num2);
	    }

	    @GetMapping("/div/{num1}/{num2}")
	    public double Division(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
	        return service.division(num1, num2);
	    }

	    @GetMapping("/sqrt/{num1}")
	    public double SquareRoot(@PathVariable("num1") int num1) {
	        return service.square(num1);
	    }

}
