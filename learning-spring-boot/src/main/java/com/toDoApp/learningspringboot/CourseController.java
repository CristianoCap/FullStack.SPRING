package com.toDoApp.learningspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CourseController {
	
	/*@RequestMapping({"/", "/courses"})
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "Learn AWS", "ToDoApp"),
				new Course(2, "Learn DevOps", "ToDoApp2")
				);
	}
	
	@GetMapping(path = "/courses/path-variable/{name}")
	public Course coursePathVariable(@PathVariable String name) {
		return new Course (1, "Learn AWS", name);
	}*/
	
	/*@GetMapping(path = "/hello-world-bean")
	public Course helloWorldBean() {
		throw new RuntimeException("Wow! You are to cute to open this tab!");
	}*/
	
}
