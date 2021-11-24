package com.cg.dms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dms.entities.Company;
import com.cg.dms.entities.Farmer;

@Repository
public interface IFarmerRepository extends JpaRepository<Farmer, Integer> {

//	public Farmer validateFarmer(String username, String password) ;
//	public Farmer addFarmer(Farmer user);
//	public Farmer updateFarmer(Farmer user);
//	public List<Farmer> getAllFarmer();
//	public List<Farmer> getFarmer(int dealerId);
//	public Company getCompany();
}