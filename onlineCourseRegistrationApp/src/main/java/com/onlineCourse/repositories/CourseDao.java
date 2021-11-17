package com.onlineCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineCourse.beans.CourseBean;

public interface CourseDao extends JpaRepository<CourseBean, Integer>{

}
