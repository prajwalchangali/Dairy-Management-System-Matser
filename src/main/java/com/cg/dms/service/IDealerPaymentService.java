package com.cg.dms.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dms.entities.Payment;
import com.cg.dms.repository.IDealerPaymentRepository;



@Service
public class IDealerPaymentService {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(IDealerPaymentService.class);
	
	@Autowired
  private IDealerPaymentRepository idp;
	
	public Payment insertDelearToCompanyPayment(Payment Payment){
		LOG.info("dealer to company");
	
  return idp.save(Payment);
}

}
