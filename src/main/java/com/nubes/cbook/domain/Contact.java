package com.nubes.cbook.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contact")
public class Contact {
		
		@Id
		private String cid;
		private String name;
		private String mobile;
		private String city;
		
}
