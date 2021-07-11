package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(1, "Java Course", "Basic of java"));
		list.add(new Course(2, "Spring Boot", "Rest Api using Spring Boot"));
	}
	
	
	@Override
	public List<Course> getcourses() {
	
		return list;
	}


	@Override
	public Course getcourse(long l) {
		// TODO Auto-generated method stub
		return "";
	}

}
