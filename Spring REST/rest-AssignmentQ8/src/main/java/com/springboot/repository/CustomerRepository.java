package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer>{

	public Customer findById(int id);
	
	public Customer findByName(String name);
}
