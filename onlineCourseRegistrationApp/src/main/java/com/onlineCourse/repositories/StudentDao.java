package com.onlineCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlineCourse.beans.Registrar;
import com.onlineCourse.beans.Student;

public interface StudentDao  extends JpaRepository<Student,Integer>{
	
	
	@Query("from Student where Stud_email=:username AND  Stud_pass=:password")
	public Student validateStudent(String  username,String  password);

}
