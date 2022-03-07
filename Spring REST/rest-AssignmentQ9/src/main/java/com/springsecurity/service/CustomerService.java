package com.springsecurity.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springsecurity.models.Customer;
import com.springsecurity.repo.CustomerRepo;

@Component
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> getAllCustomers() {
        List<Customer> list = customerRepo.findAll();
        return list;
    }

    public Customer getCustomerById(int id) {
        Customer customer = customerRepo.findById(id);
        return customer;
    }

    public Customer getCustomerByName(String name) {
        return customerRepo.findByFirstName(name);
    }

    public void addCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);
    }
}
