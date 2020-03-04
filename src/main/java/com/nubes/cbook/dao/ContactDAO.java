package com.nubes.cbook.dao;

import java.util.List;

import com.nubes.cbook.domain.Contact;

public interface ContactDAO {
	public Contact addContact(Contact contact);
	public List<Contact> getContacts();
	public List<Contact> search(String name);
	public Contact updateContact(Contact contact);
	public Contact delete(String cid);
	public Contact getContactById(String cid);
}
