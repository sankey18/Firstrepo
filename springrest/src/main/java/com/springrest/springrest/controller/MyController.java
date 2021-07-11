package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.service.CourseServiceImpl;


@RestController
public class MyController {

	
	@Autowired
	private CourseServiceImpl service;
	
	@GetMapping("/home")
	public String home() {
		return "This is home page";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.service.getcourses();
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getcourse(@PathVariable String courseId){
		return this.service.getcourse(Long.parseLong(courseId));
		
	}
}



