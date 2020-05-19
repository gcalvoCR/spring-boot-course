package com.gabriel.learning.service;

import java.util.List;
import java.util.Optional;

import com.gabriel.learning.model.Course;

public interface CourseService {
	
	public List<Course> findAllCourses();
	
	public Course saveCourse(Course course);
	
	void deleteCourse(String id);

	Optional<Course> getCourse(String id);

	Course updateCourse(Course course);

}
