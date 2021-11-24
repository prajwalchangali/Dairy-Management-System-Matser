package com.cg.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dms.entities.Customer;
//import com.cg.dms.exception.CustomerNotFoundException;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
	
//	public Customer insertCustomer(Customer customer);
//
//	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;
//
//	public Customer deleteCustomer(Customer customer) throws CustomerNotFoundException;
//
//	public Customer viewCustomer(int customerId) throws CustomerNotFoundException;
//
//	public Customer validateCustomer(String username, String password) throws CustomerNotFoundException;
}