package com.onlineCourse.Services;

import java.util.List;

import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public List<CourseBean> studentViewCourses();

}
