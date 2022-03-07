package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.entities.Customer;
import com.springboot.repository.CustomerRepository;

@Component
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	 public List<Customer> getAllCustomers() {
	        List<Customer> list = customerRepository.findAll();
	        return list;
	    }

	    public Customer getCustomerById(int id) {
	        Customer customer = customerRepository.findById(id);
	        return customer;
	    }

	    public Customer getCustomerByName(String name) {
	        return customerRepository.findByName(name);
	    }

	    public void addCustomer(Customer customer) {
	        customerRepository.save(customer);
	    }

	    public Customer updateCustomer(Customer customer) {
	        return customerRepository.save(customer);
	    }

	    public void deleteCustomer(int id) {
	        customerRepository.deleteById(id);
	    }
	
}
