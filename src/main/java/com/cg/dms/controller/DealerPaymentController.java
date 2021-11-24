package com.cg.dms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dms.entities.Payment;
import com.cg.dms.service.IDealerPaymentService;


@RestController
public class DealerPaymentController {
	
	
	private static final Logger LOG = LoggerFactory.getLogger(DealerPaymentController.class);
	
	@Autowired
	private IDealerPaymentService paymentservice;
	
	@PostMapping("/insrtdealertopay")
	public Payment insertDealerToCompanyPayment(@RequestBody Payment payment) {
		LOG.info("Insert dealer to company's payment");
		Payment pay = paymentservice.insertDelearToCompanyPayment(payment);
		return pay;
	}

}
