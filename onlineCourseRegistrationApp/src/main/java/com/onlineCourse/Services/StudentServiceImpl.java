package com.onlineCourse.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Student;
import com.onlineCourse.exceptions.CourseNotFoundException;
import com.onlineCourse.exceptions.StudentNotFoundException;
import com.onlineCourse.repositories.CourseDao;
import com.onlineCourse.repositories.StudentDao;

@Service
public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	private StudentDao studentdao;
	
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentdao.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentdao.findAll();
	}

	@Override
	public Student getStudentById(Integer studentId)throws StudentNotFoundException {
		
		return studentdao.findById(studentId).orElseThrow(() ->new StudentNotFoundException("Student not found with Id "+studentId) );
	}

	@Override
	public Student updateStudent(Student student) {
		return studentdao.save(student);
		
	}

//	@Override
//	public void insertCourseIdwithStudent(Integer studentId, Integer courseId) {
//		
//		Student st=new Student();
//		
//		//studentdao.courseLinkwithStudent(studentId,courseId);
//		studentdao.savestudentAndCourse(studentId,courseId);
//		
//	}

	
	

}
