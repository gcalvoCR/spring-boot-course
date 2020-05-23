package com.gabriel.learning.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class KeyEntity {
	
	@Id
	@Column(name="Id", unique=true)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;

	
	//getters and setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
