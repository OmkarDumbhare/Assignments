package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.entities.Product;
import com.springboot.repository.ProductRepository;

@Component
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	 public void addProduct(Product product) {
	        productRepository.save(product);
	    }

	    // Retrieving All the products
	    public List<Product> getAllProduct() {
	        return productRepository.findAll();
	    }

	    // Getting all products by id
	    public Product getProductById(int id) {
	        return productRepository.findById(id);
	    }

	    // Getting all products by name
	    public Product getProductByName(String name) {
	        return productRepository.findByName(name);
	    }

	    // Updating product by id
	    public Product updateProduct(Product product) {
	        productRepository.save(product);
	        return product;
	    }

	    // Deleting product by id
	    public void deleteProduct(int id) {
	        productRepository.deleteById(id);
	    }

	
}
