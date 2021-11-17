package com.onlineCourse.Services;

import java.util.List;

import com.onlineCourse.beans.CourseBean;

public interface CourseService {
	
	public CourseBean insertCourse(CourseBean course);
	
	public List<CourseBean> viewCourses();

}
