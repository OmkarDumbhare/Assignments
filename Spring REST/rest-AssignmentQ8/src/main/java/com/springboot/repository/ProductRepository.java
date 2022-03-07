package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {

	public Product findById(int id);
	
	public Product findByName(String name);
}
