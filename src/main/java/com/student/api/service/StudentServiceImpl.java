package com.student.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.api.entity.Student;
import com.student.api.exception.StudentNotFoundException;
import com.student.api.repositiory.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo srepo;
	
	@Override
	public Student saveStudent(Student student) {
		return srepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return srepo.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		return srepo.findById(id).orElseThrow(()-> new StudentNotFoundException("Student with this Id is Not Found!!"));
	}

	@Override
	public Student updateStudent(Student student) {
		return srepo.save(student);
	}

	@Override
	public void Delete(Long id) {
		srepo.deleteById(id);
		
	}

}
