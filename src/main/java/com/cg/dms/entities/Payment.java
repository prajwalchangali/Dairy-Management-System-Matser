package com.cg.dms.entities;

//import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;


@MappedSuperclass 
@Table(name = "payment_table")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentId;
	
	private int bill;
	private int milkunits;
	
	@ManyToOne
	@JoinColumn(name = "companyid")
	private Company company;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	
	public int getBill() {
		return bill;
	}
	
	public void setBill(int bill) {
		this.bill = bill;
	}
	
	public int getMilkunits() {
		return milkunits;
	}
	
	public void setMilkunits(int milkunits) {
		this.milkunits = milkunits;
	}	

}
