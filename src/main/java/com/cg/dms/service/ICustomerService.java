package com.cg.dms.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dms.entities.Customer;
//import com.cg.dms.exception.CustomerNotFoundException;
import com.cg.dms.repository.ICustomerRepository;

@Service
public class ICustomerService {

	private static final Logger LOG = LoggerFactory.getLogger(ICustomerService.class);

	@Autowired
	private ICustomerRepository icustomerRepository;

//	public List<Customer>viewCustomers() throws CustomerNotFoundException;
	public List<Customer> viewAllCustomers() {
		LOG.info("Get All Customer Services");
		return icustomerRepository.findAll();
	}

//	public Customer insertCustomer(Customer customer);
	public Customer insertCustomer(Customer customer) {
		LOG.info("add Customer Service");
		return icustomerRepository.save(customer);
	}

	// public Customer updateCustomer(Customer customer) throws
	// CustomerNotFoundException;
	public Customer updateCustomer(Customer customer) {
		LOG.info("Update customer Service");
		return icustomerRepository.save(customer);
	}

	// public Customer deleteCustomer(Customer customer) throws
	// CustomerNotFoundException;
	public Customer deleteCustomer(int customerId) {
		LOG.info("Delete Customer By CustomerId");
		Optional<Customer> customId = icustomerRepository.findById(customerId);
		icustomerRepository.deleteById(customerId);
		return customId.get();
	}

	// public Customer viewCustomer(int customerId) throws
	// CustomerNotFoundException;
	public Customer viewCustomer(int customerId) {
		LOG.info("View customer by customerId");
		Optional<Customer> customId = icustomerRepository.findById(customerId);
		return customId.get();
	}

//	public Customer validateCustomer(String username, String password) throws CustomerNotFoundException;
	/*
	 * public Customer validateCustomer(String username,String password) throws
	 * CustomerNotFoundException { LOG.info("Validating Customer credntials");
	 * 
	 * return null; }
	 */

}

// Extra added
//
//