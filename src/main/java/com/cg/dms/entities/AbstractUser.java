package com.cg.dms.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractUser {
	
	private String username;

	private String firsrtName;

	private String lastName;

	private String password;

	private String mobileNumber;

	private String email;

	@Column(name="milkunits", nullable=false)
	private int milkunits;

	@Column(name="unitprice", nullable=false)
	private double unitprice;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirsrtName() {
		return firsrtName;
	}

	public void setFirsrtName(String firsrtName) {
		this.firsrtName = firsrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMilkunits() {
		return milkunits;
	}

	public void setMilkunits(int milkunits) {
		this.milkunits = milkunits;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
}