package com.gabriel.learning.service;

import java.util.List;
import java.util.Optional;

import com.gabriel.learning.model.Course;

public interface CourseService {
	
	public List<Course> findAllCourses();
	
	public Course saveCourse(Course course);
	
	void deleteCourse(Long id);

	Optional<Course> getCourse(Long id);

	Course updateCourse(Course course);

}
