package com.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class Service {

	 public int Addition(int a, int b) {
	        System.out.println(a + b);
	        return a + b;
	    }

	    public int subtraction(int a, int b) {
	        System.out.println(a - b);
	        return a - b;
	    }

	    public int multiplication(int a, int b) {
	        System.out.println(a * b);
	        return a * b;
	    }

	    public double division(int a, int b) {
	        try {
	            System.out.println(a / b);
	            return a / b;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return 0;
	        }
	    }

	    public double square(int a) {
	        System.out.println(Math.sqrt(a));
	        return Math.sqrt(a);
	    }
}
