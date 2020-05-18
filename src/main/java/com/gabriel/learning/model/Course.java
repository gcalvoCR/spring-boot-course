package com.gabriel.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_Courses", schema="course_schema")
public class Course extends KeyEntity{
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="chapter_count", nullable = false)
	public int chapterCount;
	
	@Column(name="profesor")
	private String profesor;

	//Constructors
	public Course(String name, int chapterCount, String profesor) {
		super();
		this.name = name;
		this.chapterCount = chapterCount;
		this.profesor = profesor;
	}
	
	public Course() {}

		
	//getters and setters
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

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	
	
	
	
	
	

}
