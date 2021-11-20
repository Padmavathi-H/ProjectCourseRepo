package com.onlineCourse.Services;

import java.util.List;

import com.onlineCourse.beans.Registrar;
import com.onlineCourse.exceptions.RegistrarNotFoundException;

public interface RegistrarService {
	
	public Registrar saveRegistrar(Registrar registrar);

	public Registrar InsertRegistrar(Registrar regis);
	
	public List<Registrar> getAllRegistarDetails();

	public List<Registrar> deleteRegistrarById(Integer registrarId)throws RegistrarNotFoundException;

	public Registrar getRegistrarById(Integer registrarId) throws RegistrarNotFoundException;

	public Registrar updateRegistrar(Registrar registrar);

	public Registrar getRegistrarByEmail(String email);

	public void insertCourseIdwithRegistrar(Integer registrarId, Integer courseId);

	public Registrar viewCoursesByRegId(Integer registrarId);
	
	

}
