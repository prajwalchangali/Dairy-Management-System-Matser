package com.cg.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.cg.dms.entities.Company;
import com.cg.dms.entities.Payment;

public interface ICompanyPaymentRepository extends JpaRepository<Payment, Integer> {


}
