package com.bhp.forminjection.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhp.forminjection.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
