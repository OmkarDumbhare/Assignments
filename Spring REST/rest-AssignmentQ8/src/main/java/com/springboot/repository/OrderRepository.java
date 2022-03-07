package com.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entities.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {

	
}
