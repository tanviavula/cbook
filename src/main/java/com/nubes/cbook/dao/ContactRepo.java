package com.nubes.cbook.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nubes.cbook.domain.Contact;

public interface ContactRepo extends JpaRepository<Contact, String> {

}
