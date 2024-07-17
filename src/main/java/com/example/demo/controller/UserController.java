package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Contact_table;
import com.example.demo.service.ContactService;
import com.example.demo.service.NoticeService;

@Controller
public class UserController {
	@Autowired
	public ContactService contactser;
	
	@Autowired
	public NoticeService noticeser;
	
	@GetMapping("/")
	public String gethome() {
		return "home";
	}
	
	
	
	@GetMapping("/about")
	public String getabout() {
		return "about";
	}
	
	
	@GetMapping("/contact")
	public String getcontact() {
		return "contact";
	}
	
	
	@GetMapping("/notice")
	public String getnotice(Model model) {
		model.addAttribute("noticelist", noticeser.getallnotice());
		return "notice";
	}

	
	@PostMapping("/contactsave")
    public String postcontact(@ModelAttribute Contact_table contact) {
    	contactser.addContact(contact);
    	return "contact";
    
    }
}
