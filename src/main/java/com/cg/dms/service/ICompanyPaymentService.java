package com.cg.dms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dms.entities.Payment;
import com.cg.dms.repository.ICompanyPaymentRepository;

@Service
public class ICompanyPaymentService {
	
	private static final Logger LOG= LoggerFactory.getLogger(ICompanyPaymentService.class);
	
	
	@Autowired
  private ICompanyPaymentRepository iPaymentRepository;
	


	public Payment insertCompanyToFarmerPayment(Payment payment){
		LOG.info("Add company to farmer");
      return iPaymentRepository.save(payment);
  }
	
	

}
