package com.onlineCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlineCourse.beans.Registrar;
import com.onlineCourse.beans.Student;

public interface StudentDao  extends JpaRepository<Student,Integer>{
	
	
	@Query("from Student where studemail=:username AND  studpass=:password")
	public Student validateStudent(String  username,String  password);

}
