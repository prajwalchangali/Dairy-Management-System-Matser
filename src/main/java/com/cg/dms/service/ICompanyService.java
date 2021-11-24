package com.cg.dms.service;

import com.cg.dms.entities.Company;
import com.cg.dms.exception.CompanyAlreadyExistsException;
import com.cg.dms.exception.CompanyNotFoundException;
//import com.cg.dms.entities.Farmer;
import com.cg.dms.repository.ICompanyRepository;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.Optional;

@Service
public class ICompanyService {
	
	private static final Logger LOG= LoggerFactory.getLogger(ICompanyService.class);

    @Autowired
    private ICompanyRepository iCompanyRepository;

    public Company insertCompany(Company company) throws CompanyAlreadyExistsException{
    	
    	LOG.info("Service addEmployee");
		if (!iCompanyRepository.existsById(company.getCompanyid()))
			return iCompanyRepository.save(company);
		else {
			LOG.info( company.getCompanyid()+ " already exists.");
			throw new CompanyAlreadyExistsException("This company already exist");
		}
	
    }

    public int deleteCompanyById(int id) throws CompanyNotFoundException {
    	LOG.info("Service addEmployee");
		if (iCompanyRepository.existsById(id)) {
			 iCompanyRepository.deleteById(id);
		return id;
		}
		else {
			LOG.info("Company doesnt exist.");
			throw new CompanyNotFoundException("This company already exist");
		}
    }
    
    public Company updateCompany(Company company) throws CompanyNotFoundException {
    	
		LOG.info("Service updateEmployee");
		if (iCompanyRepository.existsById(company.getCompanyid()))
			return iCompanyRepository.save(company);
		else {
			LOG.info( company.getCompanyid()+ " company not found ");
			throw new CompanyNotFoundException("This company doesn't exist");
		}
	}
    
	public Company getCompanyById(int companyId)  throws CompanyNotFoundException {
		LOG.info("getCompanyId");
		Optional<Company> companyOpt = iCompanyRepository.findById(companyId);
		if (companyOpt.isPresent()) {
			LOG.info("company is available.");
			return companyOpt.get();
		} else {
			LOG.info("company is NOT available.");
			throw new CompanyNotFoundException(companyId + " this company is not found.");
		}

	}
	
	public List<Company> getAllCompany() {
		LOG.info("Service getAllCompany");
		return iCompanyRepository.findAll();
	}
    



}