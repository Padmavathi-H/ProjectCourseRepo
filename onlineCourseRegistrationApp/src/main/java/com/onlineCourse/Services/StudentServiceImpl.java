package com.onlineCourse.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Student;
import com.onlineCourse.repositories.CourseDao;
import com.onlineCourse.repositories.StudentDao;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentDao studentdao;
	
	private CourseDao courseDao;

	@Override
	public Student saveStudent(Student student) {
		
		return studentdao.save(student);
	}

	@Override
	public List<Student> studentViewCourses() {
		
		return  studentdao.findAll();
	}

}
