package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Zipcodes;
import com.springboot.service.ZipService;

@RestController
public class ZipController {

	@Autowired
    private ZipService service;

    @GetMapping("/country/{zip}")
    public Zipcodes getByZipcode(@PathVariable("zip") int zip) {
        return service.getZipcode(zip);

    }

    @GetMapping("/country")
    public List<Zipcodes> getAll() {

        for (Zipcodes z : service.getAllZipcodes()) {
            System.out.println(z);
        }
        return service.getAllZipcodes();
    }

}
