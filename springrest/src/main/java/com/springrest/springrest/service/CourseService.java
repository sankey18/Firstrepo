package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {

	public List<Course> getcourses();
	public Course getcourse();
	Course getcourse(long l);
}
