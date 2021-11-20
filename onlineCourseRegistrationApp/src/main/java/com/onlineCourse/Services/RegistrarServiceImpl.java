package com.onlineCourse.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineCourse.beans.CourseBean;
import com.onlineCourse.beans.Registrar;
import com.onlineCourse.exceptions.RegistrarNotFoundException;
import com.onlineCourse.exceptions.StudentNotFoundException;
import com.onlineCourse.repositories.CourseDao;
import com.onlineCourse.repositories.RegistrarDao;

@Service
public class RegistrarServiceImpl implements RegistrarService {

	@Autowired
	private RegistrarDao registrardao;
	
	
	@Autowired
	private CourseDao coursedao;
	
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
	@Override
	public Registrar getRegistrarById(Integer registrarId) throws RegistrarNotFoundException {
		
		return registrardao.findById(registrarId).orElseThrow(() ->new RegistrarNotFoundException("Registrar not found with Id "+registrarId) );
	}
	@Override
	public Registrar updateRegistrar(Registrar registrar) {
		
		return registrardao.save(registrar);
	}
	@Override
	public Registrar getRegistrarByEmail(String mail) {
		return registrardao.findByRegEmail(mail);
	}
	@Override
	public void insertCourseIdwithRegistrar(Integer registrarId, Integer courseId) {
		
		CourseBean ct = coursedao.findById(courseId).get();
		
		ct.setcId(ct.getcId());
        ct.setcName(ct.getcName());
        ct.setcDuration(ct.getcDuration());
        ct.setcFees(ct.getcFees());
        ct.setcCapacity(ct.getcCapacity());
        ct.setcSeats(ct.getcSeats());
        
        Registrar rt = registrardao.findById(registrarId).get();
        
        rt.setRegId(rt.getRegId());
        rt.setRegName(rt.getRegName());
        rt.setRegEmail(rt.getRegEmail());
        rt.setRegDob(rt.getRegDob());
        rt.setRegGender(rt.getRegGender());
        rt.setRegMobile(rt.getRegMobile());
        rt.setRegYOExp(rt.getRegYOExp());
        rt.setRegPass(rt.getRegPass());
        
        rt.getCourses().add(ct);
        ct.getRegistrar().add(rt);
        
        registrardao.save(rt);
		
	}
	@Override
	public Registrar viewCoursesByRegId(Integer registrarId) {
		
		return registrardao.findById(registrarId).get();
	}

}
