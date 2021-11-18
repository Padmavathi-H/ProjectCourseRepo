package com.onlineCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlineCourse.beans.CourseBean;

public interface CourseDao extends JpaRepository<CourseBean, Integer>{


	
}
