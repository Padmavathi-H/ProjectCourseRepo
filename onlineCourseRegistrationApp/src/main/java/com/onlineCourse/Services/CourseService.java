package com.onlineCourse.Services;

import java.util.List;

import javax.validation.Valid;

import com.onlineCourse.beans.CourseBean;

import com.onlineCourse.exceptions.CourseNotFoundException;


import com.onlineCourse.beans.Student;

public interface CourseService {
	
	public CourseBean insertCourse(CourseBean course);
	
	
	

	public CourseBean getCourseById(Integer courseId)throws CourseNotFoundException;

	public CourseBean updateCourse(CourseBean course);

	public List<CourseBean> getCoursesForStudents();

	public List<CourseBean> viewCourses();


}
