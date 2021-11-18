package com.onlineCourse.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineCourse.beans.Registrar;
import com.onlineCourse.exceptions.RegistrarNotFoundException;
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
	@Override
	public List<Registrar> getAllRegistarDetails() {
		
		return registrardao.findAll();
	}
	@Override
	public List<Registrar> deleteRegistrarById(Integer registrarId) throws RegistrarNotFoundException {
		
		Optional<Registrar> opt = registrardao.findById(registrarId);
		
		if(!opt.isPresent()) {
			
			throw new RegistrarNotFoundException("Registrar does not exist with the given id "+registrarId);
		}
		
		Registrar registrar = opt.get();
		
		registrardao.delete(registrar);
		
		return registrardao.findAll();
	}

}
