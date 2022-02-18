package com.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.model.Zipcodes;


@Service
public class ZipService {

	private List<Zipcodes> zipcode = new ArrayList<>(
			Arrays.asList(new Zipcodes(99501,"AK","ANCHORAGE","US")));

	public List<Zipcodes> getAllZipcodes() {
		return zipcode;
	}

	public Zipcodes getZipcode(int zipcodes) {
		return zipcode.stream().filter(z->z.getZipcode() == zipcodes).findFirst().get(); 
	}

}
