package com.onlineCourse.Services;

import java.util.List;

import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Student;

public interface CourseService {
	
	public CourseBean insertCourse(CourseBean course);
	
	public List<CourseBean> viewCourses();
	
	public List<CourseBean> getCoursesForStudents();

}
