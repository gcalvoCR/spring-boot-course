package com.gabriel.learning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.learning.model.Course;

@RestController
public class APIController {
	
	@Value("${default.course.name}")
	private String name;
	
	@Value("${default.course.chapterCount}")
	private int chapterCount;
	
	@GetMapping("/defaultcourses")
    public Course getDefaultCourse(){
        return new Course(name, chapterCount);
    }
	
	
	@GetMapping("/courses")
    public Course getCourse(@RequestParam(value="name", defaultValue = "Spring Boot", required=false) String name,
    						@RequestParam(value="chapterCount", defaultValue = "2", required=false) int chapterCount){
        return new Course(name, chapterCount);
    }
	
	@PostMapping("/courses")
	public String saveCourse(@RequestBody Course course) {
		return "Your course named " +course.getName() + " with "+ course.getChapterCount()+" chapters saved successfully! ";
	}

}
