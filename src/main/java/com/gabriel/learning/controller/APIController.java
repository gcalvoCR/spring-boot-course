package com.gabriel.learning.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.learning.config.GeneralConfiguration;
import com.gabriel.learning.model.Course;
import com.gabriel.learning.service.CourseService;

@RestController
public class APIController {
	
	@Value("${default.config.name}")
	private String name;
	
	@Value("${default.config.author}")
	private String author;
	
	@Autowired
	private GeneralConfiguration generalConfig;
	
	@Autowired
	private CourseService service;
	
	Logger logger = LoggerFactory.getLogger(APIController.class);
	
	@GetMapping("/defaultCounfig")
    public GeneralConfiguration getDefaultCourse(){
        return new GeneralConfiguration(name, author);
    }
	
	@GetMapping("/config")
    public HashMap<String, Object> getConfigCourse(){
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("name", generalConfig.getName());
		map.put("rating", generalConfig.getRating());
		map.put("author", generalConfig.getAuthor());
		
		return map;
		
    }
	
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return service.findAllCourses();
	}
	
	@GetMapping("/courses/{id}")
	public Optional<Course> saveCourse(@PathVariable Long id) {
		return service.getCourse(id);
	}
	
	@PostMapping("/courses")
	public Course saveCourse(@RequestBody Course course) {
		return service.saveCourse(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable Long id) {
		service.deleteCourse(id);
	}
	
	@PutMapping("/courses")
	public Course updateCourse(@RequestBody Course course) {
		return service.saveCourse(course);
	}

}
