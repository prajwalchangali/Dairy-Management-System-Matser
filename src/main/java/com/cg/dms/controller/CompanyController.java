package com.cg.dms.controller;

import com.cg.dms.entities.Company;
import com.cg.dms.exception.CompanyNotFoundException;
import com.cg.dms.service.ICompanyService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {
	
	private static final Logger LOG= LoggerFactory.getLogger(CompanyController.class);


    @Autowired
    private ICompanyService iCompanyService;

    @PostMapping("/company")
    public Company insertCompany(@RequestBody Company company){

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update
        company.setCompanyid(0);
        iCompanyService.insertCompany(company);
        return company;
    }


    @DeleteMapping("/company/{companyId}")
    public ResponseEntity<Company> deleteCompany(@PathVariable int companyId) throws CompanyNotFoundException {
		LOG.info("Controller deletecompany");
		 iCompanyService.deleteCompanyById(companyId);
	HttpHeaders headers = new HttpHeaders();
	ResponseEntity<Company> response;
	headers.add("message", "This" +companyId+"company is not present in the database.");
	LOG.info(headers.toString());
	response = new ResponseEntity<Company>(headers, HttpStatus.OK);
	return response;
//		return iCompanyService.deleteCompanyById(companyId);
    }
    
    @PutMapping("/updatecomp")
	public ResponseEntity<Company> updateCompany(@RequestBody Company company) throws CompanyNotFoundException {
//		System.out.println("Controller updateEmp");
		LOG.info("Controller updatecompany");
		Company cmp = iCompanyService.updateCompany(company);
	HttpHeaders headers = new HttpHeaders();
	ResponseEntity<Company> response;
	headers.add("message", "This company is not present in the database.");
	LOG.info(headers.toString());
	response = new ResponseEntity<Company>(cmp, headers, HttpStatus.OK);
	return response;
//		return empService.updateEmployee(employee);
	}
    
    @GetMapping("/getcompanybyid/{companyId}")
	public ResponseEntity<Company> getcompanyById(@PathVariable(name = "companyId") int companyId)
			throws CompanyNotFoundException {
		LOG.info("getcompanyById");
		Company company = iCompanyService.getCompanyById(companyId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "This company is available in the database.");
		LOG.info(headers.toString());
		ResponseEntity<Company> response = new ResponseEntity<Company>(company, headers, HttpStatus.OK);
		return response;
	}
    @GetMapping("/getallcompany")
	public List<Company> getAllCompany() {
		LOG.info("getAllCompany");

		return iCompanyService.getAllCompany();
	}

}
