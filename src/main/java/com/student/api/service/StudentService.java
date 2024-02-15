package com.student.api.service;

import java.util.List;

import com.student.api.entity.Student;

public interface StudentService {

	Student saveStudent (Student student);
	List<Student> getAllStudent();
	 Student getStudentById (Long id);
	Student updateStudent (Student student);
	void Delete (Long id);
}
