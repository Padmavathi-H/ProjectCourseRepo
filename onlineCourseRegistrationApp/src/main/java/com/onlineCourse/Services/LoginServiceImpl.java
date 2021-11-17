package com.onlineCourse.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineCourse.beans.Admin;
import com.onlineCourse.beans.Registrar;
import com.onlineCourse.beans.Student;
import com.onlineCourse.repositories.AdminDao;
import com.onlineCourse.repositories.RegistrarDao;
import com.onlineCourse.repositories.StudentDao;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private AdminDao admindao;
	
	@Autowired
	private RegistrarDao registrardao;
	
	@Autowired
	private StudentDao studentdao;

	@Override
	public Admin authenticateAdmin(String username, String password) {
		
		return  admindao.validateAdmin(username, password);
	}
	
	@Override
	public Student authenticateStudent(String username, String password) {
		
		return studentdao.validateStudent(username, password);
	}

	@Override
	public Registrar authenticateRegistrar(String username, String password) {
		
		return  registrardao.validateRegistrar(username, password);
	}
	
}
