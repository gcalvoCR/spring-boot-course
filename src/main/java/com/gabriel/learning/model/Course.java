package com.gabriel.learning.model;

public class Course {
	
	public String name;
	public int chapterCount;
	
	//Constructors
	public Course() {}
	
	public Course(String name, int chapterCount) {
		super();
		this.name = name;
		this.chapterCount = chapterCount;
	}
	
	//Getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChapterCount() {
		return chapterCount;
	}
	public void setChapterCount(int chapterCount) {
		this.chapterCount = chapterCount;
	}
	
	

}
