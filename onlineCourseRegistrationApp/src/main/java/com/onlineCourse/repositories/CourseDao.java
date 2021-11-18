package com.onlineCourse.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlineCourse.beans.CourseBean;

public interface CourseDao extends JpaRepository<CourseBean, Integer>{
	
	
	@Query("select c_Id, c_Name, c_Duration, c_Fees, c_Seats from course_bean ")
	public List<CourseBean> viewCourses();

}
