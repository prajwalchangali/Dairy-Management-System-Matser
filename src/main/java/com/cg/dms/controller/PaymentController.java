//package com.cg.dms.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
////import com.cg.dms.entities.Customer;
//import com.cg.dms.entities.Payment;
////import com.cg.dms.service.ICustomerService;
//import com.cg.dms.service.IPaymentService;
//
//@RestController
//public class PaymentController {
//	
//	private static final Logger LOG = LoggerFactory.getLogger(PaymentController.class);
//	
//	@Autowired
//	private IPaymentService paymentservice;
//	
//	
//	@PostMapping("/insrtcompnaytopay")
//	public Payment insertCompanyToFarmerPayment(@RequestBody Payment payment) {
//		LOG.info("INSERT_CUSTOMER_TO_FARMER_PAYMENT");
//		Payment pay = paymentservice.insertCompanyToFarmerPayment(payment);
//		return pay;
//	}
//	
//	@PostMapping("/insrtdealertopay")
//	public Payment insertDealerToCompanyPayment(@RequestBody Payment payment) {
//		LOG.info("Insert dealer to company's payment");
//		Payment pay = paymentservice.insertDelearToCompanyPayment(payment);
//		return pay;
//	}
//		
//		@PostMapping("/insrtcustomtopay")
//		public Payment insertCustomerToDealerPayment(@RequestBody Payment payment) {
//			LOG.info("Insert customer to company payment ");
//			Payment pay = paymentservice.insertCustomerToDelearPayment(payment);
//			return pay;
//	}
//
//}
