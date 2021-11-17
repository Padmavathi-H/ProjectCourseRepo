package com.onlineCourse.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineCourse.beans.Student;
import com.onlineCourse.repositories.StudentDao;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentDao studentdao;

	@Override
	public Student saveStudent(Student student) {
		
		return studentdao.save(student);
	}

}
