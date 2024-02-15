package com.student.api.testController;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.student.api.controller.StudentController;
import com.student.api.entity.Student;
import com.student.api.service.StudentService;

@ExtendWith(MockitoExtension.class)
public class StudentControllerTest {
   
	@InjectMocks
	private StudentController studentCon;
	
	@Mock
	StudentService sService;
	
	@Test
	public void gellStudent() {
		Student s1= new Student(101L,"khushi","computerApplication");
		Student s2= new Student(102L,"Ayushi","computerApplication");
		List<Student>student=new ArrayList<>();
		student.add(s1);
		student.add(s2);
		when(sService.getAllStudent()).thenReturn(student);
		assertNotNull(studentCon.getallStudent());
	}
	
}
