package com.nubes.cbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.nubes.cbook.dao.ContactDAO;
import com.nubes.cbook.dao.IdGenerator;
import com.nubes.cbook.domain.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	private ContactDAO contactDao;

	@Autowired
	public ContactServiceImpl(ContactDAO contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public Contact addContact(Contact contact) {
		Assert.notNull(contact, "Contact object can't be null");
		String cid = IdGenerator.getNewId();
		contact.setCid(cid);
		contact = contactDao.addContact(contact);
		return contact;
	}

	@Override
	public List<Contact> getContacts() {
		return contactDao.getContacts();
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
