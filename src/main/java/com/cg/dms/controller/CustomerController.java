package com.cg.dms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dms.entities.Customer;
import com.cg.dms.service.ICustomerService;

@RestController
public class CustomerController {
	
	private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private ICustomerService customerservice;
	
	//https://localhost:8082/vwalcusts
	@GetMapping("/viewallcustoms")
	public List<Customer> viewCustomers(){
		LOG.info("VIEW_ALL_CUSTOMERS_CONTROLLER");
		List<Customer> list = customerservice.viewAllCustomers();
		return list;
	}
	
	//https://localhost:8082/insrtcustom
	@PostMapping("/insrtcustom")
	public Customer insertCustomer(@RequestBody Customer customer) {
		LOG.info("INSERT_CUSTOMER_CONTROLLER");
		Customer custom = customerservice.insertCustomer(customer);
		return custom;
	}
	
	//https://localhost:8082/updtcustom
	@PutMapping("/updtcustom")
	public Customer updateCustomer(@RequestBody Customer customer) {
		LOG.info("UPDATE_CUSTOMER_CONTROLLER");
		Customer custom = customerservice.updateCustomer(customer);
		return custom;
	}
	
	//https://localhost:8082/delbyid/{customerId}
	@DeleteMapping("/delbyid/{customerId}")
	public Customer deleteCustomerById(@PathVariable int customerId) {
		LOG.info("DELETE_CUSTOMER_BY_ID_CONTROLLER");
		Customer custom = customerservice.deleteCustomer(customerId);
		return custom;
	}
	
	//https://localhost:8082/viewcustombyid/{customerId}
	@GetMapping("/viewcustombyid/{customerId}")
	public Customer viewCustomerById(@PathVariable int customerId) {
		LOG.info("VIEW_CUSTOMER_BY_ID");
		Customer custom = customerservice.viewCustomer(customerId);
		return custom;
	}
	
	
	
	

}
