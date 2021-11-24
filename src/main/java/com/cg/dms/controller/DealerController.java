package com.cg.dms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dms.entities.Company;
import com.cg.dms.entities.Dealer;
import com.cg.dms.exception.DealerNotFoundException;
import com.cg.dms.service.ICompanyService;
import com.cg.dms.service.IDelearService;

@RestController
public class DealerController {

	private static final Logger LOG = LoggerFactory.getLogger(DealerController.class);

	@Autowired
	private IDelearService idealerservice;
	
	@Autowired
	private ICompanyService iCompanyService;

	@PostMapping("/adddealer")
	public ResponseEntity<Dealer> adddealer(@RequestBody Dealer dealer) throws DealerNotFoundException {
		LOG.info("Controller addDealer");
		Dealer deal = idealerservice.insertDealer(dealer);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", " New Dealer is added to the Database");
		ResponseEntity<Dealer> response = new ResponseEntity<Dealer>(deal, headers, HttpStatus.OK);
		return response;
	}

	@GetMapping("/getdealbyid/{dealerId}")
	public ResponseEntity<Dealer> getDealById(@PathVariable(name = "dealerId") int dealerId)
			throws DealerNotFoundException {
		LOG.info("getdealById");
		Dealer deal = idealerservice.getDealerById(dealerId);
		LOG.info(deal.toString());
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This dealer is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Dealer> response = new ResponseEntity<Dealer>(deal, headers, HttpStatus.OK);
		return response;
	}

	@PutMapping("/updatedealer")
	public ResponseEntity<Dealer> updateEmp(@RequestBody Dealer dealer) throws DealerNotFoundException {
		LOG.info("Controller updatedealer");
		Dealer deal = idealerservice.updateDealer(dealer);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This dealer data is updated in database.");
		ResponseEntity<Dealer> response = new ResponseEntity<Dealer>(deal, headers, HttpStatus.OK);
		return response;
	}

	@DeleteMapping("/deletedealbyid/{dealerid}")
	public ResponseEntity<Dealer> deletedealById(@PathVariable(name = "dealerid") int dealerid)
			throws DealerNotFoundException {
		LOG.info("deletedealerbyid");
		Dealer dealer = idealerservice.deleteDealerById(dealerid);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This dealer is deleted from the Database");
		LOG.info(headers.toString());
		ResponseEntity<Dealer> response = new ResponseEntity<Dealer>(dealer, headers, HttpStatus.OK);
		return response;
	}

	@GetMapping("/getallcompanies")
	public List<Company> getAllCompany() {
		LOG.info("getAllCompany");
		List<Company> list = iCompanyService.getAllCompany();
		return list;
	}
}
