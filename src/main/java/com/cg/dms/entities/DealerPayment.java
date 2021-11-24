package com.cg.dms.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DealerPayment extends Payment {
	
	
	@ManyToOne
	@JoinColumn(name = "companyid")
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	} 

}
