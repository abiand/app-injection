package com.bhp.forminjection.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhp.forminjection.dao.CustomerRepo;
import com.bhp.forminjection.model.Customer;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer save(Customer customer) {
	
		return customerRepo.save(customer);
	
	}
	
	public Customer findOne(Long id) {
		//System.out.println(customerRepo.findById(id).get() + "tes service");
		
		//customerRepo.
		
		
		Customer aaa = customerRepo.findById(id).get();
		return aaa;
	}
	
	public List<Customer> findAll() {
		
		return customerRepo.findAll();
	
	}
	
	public void removeOne(Long id) {
	
		customerRepo.deleteById(id);
	
	}
}
