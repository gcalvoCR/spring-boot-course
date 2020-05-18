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

import com.gabriel.learning.config.GeneralConfiguration;
import com.gabriel.learning.model.Course;

@RestController
public class APIController {
	
	@Value("${default.config.name}")
	private String name;
	
	@Value("${default.config.author}")
	private String author;
	
	@Autowired
	private GeneralConfiguration generalConfig;
	
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
	
	
	@PostMapping("/courses")
	public String saveCourse(@RequestBody Course course) {
		return "Your course named " +course.getName() + " with "+ course.getChapterCount()+" chapters saved successfully! ";
	}

}
