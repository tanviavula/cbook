package com.nubes.cbook.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nubes.cbook.domain.Contact;
import com.nubes.cbook.service.ContactService;

@RestController
@RequestMapping("/contacts/")
public class ContactController {

	private ContactService contactService;

	@Autowired
	public ContactController(ContactService contactService) {
		this.contactService = contactService;
	}

	@PostMapping("addnewcontact")
	public Contact addContact(@RequestBody Contact contact) {
		return contactService.addContact(contact);
	}

	@GetMapping("/getall")
	public List<Contact> getAllContacts() {
		return contactService.getContacts();
	}
}
