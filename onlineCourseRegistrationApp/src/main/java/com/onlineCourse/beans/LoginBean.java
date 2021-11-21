package com.onlineCourse.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;




public class LoginBean {
	
	
	
	@NotEmpty(message="username is mandatory")
	private String username;
	@NotEmpty(message="password is mandatory")
	private String password;
	
	//@NotEmpty(message="loginoption is mandatory")
	private String loginoption;
	
	

	@Override
	public String toString() {
		return "LoginBean [username=" + username + ", password=" + password + ", loginoption=" + loginoption + "]";
	}

	public LoginBean() {
		super();
	}

	public LoginBean(String username, String password, String loginoption) {
		super();
		this.username = username;
		this.password = password;
		this.loginoption = loginoption;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLoginoption() {
		return loginoption;
	}

	public void setLoginoption(String loginoption) {
		this.loginoption = loginoption;
	}
	
	
	
	

}
