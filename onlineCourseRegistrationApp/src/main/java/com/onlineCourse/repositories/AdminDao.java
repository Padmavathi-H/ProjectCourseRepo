package com.onlineCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onlineCourse.beans.Admin;


public interface AdminDao  extends JpaRepository<Admin,Integer> {

	@Query("from Admin where username=:username AND password=:password")
	public Admin validateAdmin(String username,String password);
}

