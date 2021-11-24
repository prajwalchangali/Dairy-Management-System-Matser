package com.cg.dms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dms.entities.Company;
import com.cg.dms.entities.Customer;
import com.cg.dms.entities.Dealer;
import com.cg.dms.exception.DealerNotFoundException;

@Repository
public interface IDelearRepository extends JpaRepository<Dealer, Integer> {

//	public Dealer insertDealer(Dealer dealer);
//
//	public Dealer updateDealer(Dealer dealer) throws DealerNotFoundException;
//
//	public Dealer deleteDealer(Dealer dealer) throws DealerNotFoundException;
//
//	public List<Dealer> getDealer(int dealerId);
//
//	public List<Customer> getAllCustomers();
//
//	public List<Customer> getCustomer(int customerId);
//
//	public List<Company> getAllCompanys();
//
//	public Company getCompany(int comapnyId);
}