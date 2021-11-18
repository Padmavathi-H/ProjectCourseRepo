package com.onlineCourse.Services;

import java.util.List;

import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();

	public void insertCourseIdwithStudent(Integer studentId, Integer courseId);
	
	

}
