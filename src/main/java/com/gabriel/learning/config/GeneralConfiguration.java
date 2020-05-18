package com.gabriel.learning.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("config")
public class GeneralConfiguration {
	
	private String name;
	private int rating;
	private String author;
	
	//Constructors
	public GeneralConfiguration(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	
	public GeneralConfiguration() {}
	
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}	

}
