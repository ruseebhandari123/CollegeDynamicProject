package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Contact_table;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService{
    @Autowired
	public ContactRepository contactrepo;
	
	@Override
	public void addContact(Contact_table contact) {
    contactrepo.save(contact);		
	}

	@Override
	public List<Contact_table> getallcontact() {
		return contactrepo.findAll();
	}

}
