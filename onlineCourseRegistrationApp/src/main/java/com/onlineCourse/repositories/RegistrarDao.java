package com.onlineCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlineCourse.beans.Admin;
import com.onlineCourse.beans.Registrar;

public interface RegistrarDao extends JpaRepository<Registrar,Integer> {

	@Query("from Registrar where regEmail=:username AND regPass=:password")
	public Registrar validateRegistrar(String username,String password);
	
}
