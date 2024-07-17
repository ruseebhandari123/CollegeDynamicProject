package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact_table {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String customer_name;
    private String customer_address;
    private String customer_phonenumber;
    private String customer_message;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public String getCustomer_phonenumber() {
		return customer_phonenumber;
	}
	public void setCustomer_phonenumber(String customer_phonenumber) {
		this.customer_phonenumber = customer_phonenumber;
	}
	public String getCustomer_message() {
		return customer_message;
	}
	public void setCustomer_message(String customer_message) {
		this.customer_message = customer_message;
	}
	@Override
	public String toString() {
		return "Contact_table [id=" + id + ", customer_name=" + customer_name + ", customer_address=" + customer_address
				+ ", customer_phonenumber=" + customer_phonenumber + ", customer_message=" + customer_message + "]";
	}
    
}
