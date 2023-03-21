package com.springstack01.stackspringboot01.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@GetMapping("/courses")
	public List<Courses> getAllCourses() {
		return Arrays.asList(new Courses(1, "Microservice","by yourself"));
	}
}
