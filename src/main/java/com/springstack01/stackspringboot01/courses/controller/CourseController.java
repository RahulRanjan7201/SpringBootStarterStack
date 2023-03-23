package com.springstack01.stackspringboot01.courses.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springstack01.stackspringboot01.courses.repository.CourseRepository;

@RestController
public class CourseController {
	@Autowired
	private CourseRepository courseRepository;
	@GetMapping("/courses/{id}")
	public Courses getAllCourses(@PathVariable long id) {
		Optional<Courses> course =  courseRepository.findById(id);
		if(course.isEmpty()) {
			throw new RuntimeException("Course not found with ID"+ id);
		}
		return course.get();
	}
	@PostMapping("/courses")
	public void createCourse(@RequestBody Courses course) {
		courseRepository.save(course);
	}
	@PutMapping("/courses")
	public void updateCourse(@RequestBody Courses course) {
		courseRepository.save(course);
	}
}
