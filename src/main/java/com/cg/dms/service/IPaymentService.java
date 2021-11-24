//package com.cg.dms.service;
//
////import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
////import com.cg.dms.entities.Company;
////import com.cg.dms.entities.Customer;
//import com.cg.dms.entities.Payment;
//import com.cg.dms.repository.IPaymentRepository;
//
//@Service
//public class IPaymentService
//{
//	@Autowired
//    private IPaymentRepository iPaymentRepository;
//
//	public Payment insertCompanyToFarmerPayment(Payment Payment){
//        return iPaymentRepository.save(Payment);
//    }
//	
//	public Payment insertDelearToCompanyPayment(Payment Payment){
//        return iPaymentRepository.save(Payment);
//    }
//	
//	public Payment insertCustomerToDelearPayment(Payment Payment){
//        return iPaymentRepository.save(Payment);
//    }
//	
////	public List<Payment> viewAllPaymentCostumer(int customerid) {
////		System.out.println("Service viewAllPaymentCostumer");
////		return iPaymentRepository.findAll();
////	}
////	
////	public List<Payment> viewAllPaymentDelear(int delearid) {
//////		System.out.println("Service viewAllPaymentDelear");
////		
////		return iPaymentRepository.findAll();
////	}
////	
////	public List<Payment> viewAllPaymentCompany(int companyid) {
////		List<Payment> paymentcomp = iPaymentRepository.findAllById(companyid);
////		return paymentcomp;
////	}
//}
