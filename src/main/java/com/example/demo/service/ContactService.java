package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Contact_table;

public interface ContactService {

	void addContact(Contact_table contact);
	
	List<Contact_table> getallcontact();
}
