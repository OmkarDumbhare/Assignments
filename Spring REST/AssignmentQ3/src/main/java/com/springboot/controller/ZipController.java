package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.model.Zipcodes;
import com.springboot.service.ZipService;

public class ZipController {

	@Autowired
    private ZipService service;

    @GetMapping("/country/{id}")
    public Zipcodes getByZipcode(@PathVariable("id") int id) {
        System.out.println("Zipcode is: " + id);
        return service.getzipcodeByzipcode(id);

    }

    @GetMapping("/country")
    public List<Zipcodes> getAll() {

        for (Zipcodes z : service.getAll()) {
            System.out.println(z);
        }
        return service.getAll();
    }

}
