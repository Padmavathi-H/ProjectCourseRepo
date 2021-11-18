package com.onlineCourse.Services;

import java.util.List;

import javax.validation.Valid;

import com.onlineCourse.beans.CourseBean;
<<<<<<< HEAD
import com.onlineCourse.exceptions.CourseNotFoundException;

=======
import com.onlineCourse.beans.Student;
>>>>>>> branch 'master' of https://github.com/Padmavathi-H/ProjectCourseRepo.git

public interface CourseService {
	
	public CourseBean insertCourse(CourseBean course);
	
	public List<CourseBean> viewCourses();
	
<<<<<<< HEAD
	public CourseBean getCourseById(Integer courseId)throws CourseNotFoundException;

	public CourseBean updateCourse(CourseBean course);
=======
	public List<CourseBean> getCoursesForStudents();
>>>>>>> branch 'master' of https://github.com/Padmavathi-H/ProjectCourseRepo.git

}
