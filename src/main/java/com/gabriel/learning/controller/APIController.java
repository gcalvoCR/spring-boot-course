package com.gabriel.learning.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.learning.config.CourseConfiguration;
import com.gabriel.learning.model.Course;

@RestController
public class APIController {
	
	@Value("${default.course.name}")
	private String name;
	
	@Value("${default.course.chapterCount}")
	private int chapterCount;
	
	@Autowired
	private CourseConfiguration course;
	
	Logger logger = LoggerFactory.getLogger(APIController.class);
	
	@GetMapping("/defaultcourses")
    public Course getDefaultCourse(){
        return new Course(name, chapterCount);
    }
	
	@GetMapping("/configcourses")
    public HashMap<String, Object> getConfigCourse(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", course.getName());
		map.put("chapterCount", course.getChapterCount());
		map.put("rating", course.getRating());
		map.put("author", course.getAuthor());
		
		return map;
		
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
