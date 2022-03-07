package com.springsecurity.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.models.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, Integer> {
    public Customer findById(int id);

    public Customer findByFirstName(String name);
}
