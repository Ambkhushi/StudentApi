package com.student.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.api.entity.Student;
import com.student.api.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService Sservice;

	@PostMapping
	Student saveStudent(@RequestBody Student student) {
		return Sservice.saveStudent(student);
	}

	@GetMapping
	public List<Student> getallStudent() {
		return Sservice.getAllStudent();
	}

	@GetMapping("/{id}")
	Student getStudentbyid(@PathVariable Long id) {
		return Sservice.getStudentById(id);
	}

	@PutMapping("/{id}")
	Student upadteStudent(@PathVariable Long id, @RequestBody Student student) {
		return Sservice.updateStudent(student);
	}

	@DeleteMapping("/{id}")
	String deleteStudent(@PathVariable Long id) {
		Sservice.Delete(id);
		return "Student deleted successfully";
	}
}
