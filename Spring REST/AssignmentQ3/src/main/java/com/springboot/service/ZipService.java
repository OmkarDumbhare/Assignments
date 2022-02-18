package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.model.Zipcodes;

@Service
public class ZipService {

	private static List<Zipcodes> list = new ArrayList<Zipcodes>();

  
    static {
        list.add(new Zipcodes(99501, "AK", "ANCHORAGE", "US"));
    }

    public Zipcodes getzipcodeByzipcode(int zipcode) {

        return list.stream().filter(z -> z.getZipcode() == zipcode).findFirst().get();
    }

    public List<Zipcodes> getAll() {
        return list;
    }

}
