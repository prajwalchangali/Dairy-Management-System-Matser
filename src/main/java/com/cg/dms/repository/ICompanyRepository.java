package com.cg.dms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dms.entities.Company;
import com.cg.dms.entities.Dealer;
import com.cg.dms.entities.Farmer;

@Repository
public interface ICompanyRepository extends JpaRepository<Company, Integer> {

//	public Company insertCompany(Company company);
//	public Company updateCompany(Company company) ;//throws CompanyNotFoundException;
//	public Company deleteCompany(Company company) ;
//	public List<Farmer> getAllFormers();
//	public Farmer getFormer(int farmerId);
//    public List<Dealer> getAllDealers();
//	public List<Dealer> getDealer(int dealerId);
}