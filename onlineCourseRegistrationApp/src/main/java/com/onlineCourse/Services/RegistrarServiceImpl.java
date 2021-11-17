package com.onlineCourse.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineCourse.beans.Registrar;
import com.onlineCourse.repositories.RegistrarDao;

@Service
public class RegistrarServiceImpl implements RegistrarService {

	@Autowired
	private RegistrarDao registrardao;
	
	@Override
	public Registrar saveRegistrar(Registrar registrar) {
		
		return registrardao.save(registrar);
	}
	@Override
	public Registrar InsertRegistrar(Registrar regis) {
		// TODO Auto-generated method stub
		return registrardao.save(regis) ;
	}

}
