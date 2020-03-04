package com.nubes.cbook.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.nubes.cbook.domain.Contact;

@Repository
public class InMemoryImpl implements ContactDAO {

	private List<Contact> contacts;
	private static final Logger LOG = LoggerFactory.getLogger(InMemoryImpl.class);
    
	public InMemoryImpl() {
		contacts = new ArrayList<Contact>();
	}
	@Override
	public Contact addContact(Contact contact) {
		String cid = IdGenerator.getNewId();
		contact.setCid(cid);
		contacts.add(contact);
		LOG.info("Contact is added with the id:{}", contact.getCid());
		return contact;
	}

	@Override
	public List<Contact> getContacts() {
		LOG.info("Total contact found :{}", contacts.size());
		return contacts;
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
