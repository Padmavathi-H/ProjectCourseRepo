package com.onlineCourse.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineCourse.beans.CourseBean;
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

}
