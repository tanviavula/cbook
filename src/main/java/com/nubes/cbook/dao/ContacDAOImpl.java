package com.nubes.cbook.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.nubes.cbook.domain.Contact;
@Repository
@Primary
public class ContacDAOImpl implements ContactDAO{
	@Autowired
	private ContactRepo contactRepo;
	@Override
	public Contact addContact(Contact contact) {
		return contactRepo.save(contact);
	}

	@Override
	public List<Contact> getContacts() {
		return contactRepo.findAll();
	}

	@Override
	public List<Contact> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact delete(String cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContactById(String cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
