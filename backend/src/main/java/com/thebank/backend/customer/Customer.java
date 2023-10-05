package com.thebank.backend.customer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	@JsonProperty("customerID")
	private Long customerID;
	private String name;
	private String email;
	
	public Customer(){
		
	}
	
	public Customer(Long customerID, String name, String email) {
		this.customerID = customerID;
		this.name = name;
		this.email = email;
	}
	
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	} 
	
	public Long getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(Long customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer{"+
				"customerID=" + customerID +
				", name=" + name +
				", email=" + email +
				"}";
	}
}
