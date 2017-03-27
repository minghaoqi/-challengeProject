package com.first.entity;

import java.io.Serializable;


public class customerBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  customerName;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public static void main(String[] args) {
	  customerBean c = new customerBean();
	  c.setCustomerName("111");
	  System.out.println(c.getCustomerName());
	}	
}
