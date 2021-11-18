package com.onlineCourse.Services;

import java.util.List;

import javax.validation.Valid;

import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.exceptions.CourseNotFoundException;


public interface CourseService {
	
	public CourseBean insertCourse(CourseBean course);
	
	public List<CourseBean> viewCourses();
	
	public CourseBean getCourseById(Integer courseId)throws CourseNotFoundException;

	public CourseBean updateCourse(CourseBean course);

}
