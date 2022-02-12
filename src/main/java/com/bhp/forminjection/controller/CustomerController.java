package com.bhp.forminjection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bhp.forminjection.model.Customer;
import com.bhp.forminjection.service.CustomerService;

@RestController
@RequestMapping(CustomerController.BASE_URL)
public class CustomerController {

	public static final String BASE_URL = "/api/customers";
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return customerService.findAll();
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerByID(@PathVariable Long id){
		//System.out.println(customerService.findOne(id) + "tes Controller");
		return customerService.findOne(id);
	}
	
	
	@PostMapping
	//@ResponseStatus(HttpStatus.CREATED)
	public Customer createCustomer(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@PutMapping
	// @ResponseStatus(HttpStatus.CREATED)
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		customerService.removeOne(id);
	}
}

