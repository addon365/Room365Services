package com.addon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.addon.models.Customer;
import com.addon.services.CustomerRepository;

@RestController
public class CustomerContoller {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@PostMapping("/customers")
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerRepository.save(customer);
	}
	
	@GetMapping("/customers")
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
