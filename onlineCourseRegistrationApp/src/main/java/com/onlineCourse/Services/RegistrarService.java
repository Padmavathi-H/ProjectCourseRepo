package com.onlineCourse.Services;

import java.util.List;

import com.onlineCourse.beans.Registrar;
import com.onlineCourse.exceptions.RegistrarNotFoundException;

public interface RegistrarService {
	
	public Registrar saveRegistrar(Registrar registrar);

	public Registrar InsertRegistrar(Registrar regis);
	
	public List<Registrar> getAllRegistarDetails();

	public List<Registrar> deleteRegistrarById(Integer registrarId)throws RegistrarNotFoundException;
	
	

}
