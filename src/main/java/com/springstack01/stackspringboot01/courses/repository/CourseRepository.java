package com.springstack01.stackspringboot01.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springstack01.stackspringboot01.courses.controller.Courses;

public interface CourseRepository extends JpaRepository<Courses, Long>{

}
