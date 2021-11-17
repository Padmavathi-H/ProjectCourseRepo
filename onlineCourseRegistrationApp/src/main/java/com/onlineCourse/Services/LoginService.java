package com.onlineCourse.Services;

import org.springframework.stereotype.Service;

import com.onlineCourse.beans.Admin;
import com.onlineCourse.beans.Registrar;
import com.onlineCourse.beans.Student;



public interface LoginService {
	

	public Student authenticateStudent(String username,String password);
    
	public Registrar authenticateRegistrar(String username,String password);

	public Admin authenticateAdmin(String username,String password);

}
