package com.onlineCourse.Services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.onlineCourse.beans.CourseBean;

import com.onlineCourse.exceptions.CourseNotFoundException;
import com.onlineCourse.beans.Student;
import com.onlineCourse.repositories.CourseDao;



@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public CourseBean insertCourse(CourseBean course) {
		
		
		return courseDao.save(course);
	}

	@Override
	public List<CourseBean> viewCourses() {
		
		return courseDao.findAll();
	}

	@Override
	public CourseBean getCourseById(Integer courseId) throws CourseNotFoundException {
		
		return courseDao.findById(courseId).orElseThrow(() ->new CourseNotFoundException("Course not found with Id "+courseId) );
	}

	@Override
	public CourseBean updateCourse(CourseBean course) {
		

		Integer initialcapacity=course.getC_Capacity();
		
		CourseBean updatedcourse=courseDao.save(course);
		
		Integer finalcapacity=updatedcourse.getC_Capacity();
		
		if(finalcapacity<initialcapacity) {
			return course;
		}
		else {
			return updatedcourse;
		}
		
		
		
		
		
		 
	}

	public List<CourseBean> getCoursesForStudents() {
		
		return courseDao.viewCourses();
	}


}
