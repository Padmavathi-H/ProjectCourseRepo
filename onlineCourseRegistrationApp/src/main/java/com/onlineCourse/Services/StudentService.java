package com.onlineCourse.Services;

import java.util.List;

import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Student;
import com.onlineCourse.exceptions.StudentNotFoundException;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<Student> getAllStudents();

	public Student getStudentById(Integer studentId) throws StudentNotFoundException;

	public Student updateStudent(Student student);

	public void insertCourseIdwithStudent(Integer studentId, Integer courseId);

	public Student getMyCourses(Integer studentId);
	
	

}
