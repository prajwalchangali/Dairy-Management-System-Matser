package com.cg.dms.entities;

import java.io.Serializable;

import javax.persistence.*;



@Entity 
public class Company implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int companyid;

	private String companyName;

	private String email;

	private String password;

	private String mobileNumber;

	private String address;
	
//	public Dealer getDealer() {
//		return dealer;
//	}
//
//	public void setDealer(Dealer dealer) {
//		this.dealer = dealer;
//	}

//	@OneToOne
//	@JoinColumn(name = "dealerId")
//	private Dealer dealer;

	public Company() {
	}

	public Company(String companyName, String email, String password, String mobileNumber, String address) {
		this.companyName = companyName;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}



	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}