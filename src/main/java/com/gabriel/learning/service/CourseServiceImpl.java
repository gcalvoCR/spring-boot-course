package com.gabriel.learning.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.learning.model.Course;
import com.gabriel.learning.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepository repository;
	

	@Override
	public List<Course> findAllCourses() {
		return repository.findAll();
	}
	
	@Override
	public Optional<Course> getCourse(String id) {
		return repository.findById(id);
	}
	
	@Override
	public Course saveCourse(Course course) {
		return repository.save(course);
	}
	
	@Override
	public void deleteCourse(String id) {
		repository.deleteById(id);
	}
	
	@Override
	public Course updateCourse(Course course) {
		return repository.save(course); 
	}

}
