package com.onlineCourse.beans;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer stud_id;
	
	@NotEmpty(message = "Name is mandatory")
	@Size(min=3,message = "Minimum size should be 3 charecter")
	private String  stud_name;
	
	@Email(message = "Enter Valid Email Address")
	private String  stud_email;
	
	@NotEmpty(message="must slecet gender")
	private String  gender;
	
	private String  stud_address;
	
	private String stud_mobile;
	
	@Past(message="Date should in the past")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate stud_DOB;
	
	private String stud_pass;
	
	private String stud_cpass;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_email=" + stud_email + ", gender="
				+ gender + ", stud_address=" + stud_address + ", stud_mobile=" + stud_mobile + ", stud_DOB=" + stud_DOB
				+ ", stud_pass=" + stud_pass + ", stud_cpass=" + stud_cpass + "]";
	}
	public Student() {
		super();
	}
	public Student(Integer stud_id,
			String stud_name,
		     String stud_email, String gender, String stud_address,
			String stud_mobile, LocalDate stud_DOB, String stud_pass,
			String stud_cpass) {
		super();
		this.stud_id = stud_id;
		this.stud_name = stud_name;
		this.stud_email = stud_email;
		this.gender = gender;
		this.stud_address = stud_address;
		this.stud_mobile = stud_mobile;
		this.stud_DOB = stud_DOB;
		this.stud_pass = stud_pass;
		this.stud_cpass = stud_cpass;
	}
	public Integer getStud_id() {
		return stud_id;
	}
	public void setStud_id(Integer stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_email() {
		return stud_email;
	}
	public void setStud_email(String stud_email) {
		this.stud_email = stud_email;
	}
	public String getStud_address() {
		return stud_address;
	}
	public void setStud_address(String stud_address) {
		this.stud_address = stud_address;
	}
	public String getStud_mobile() {
		return stud_mobile;
	}
	public void setStud_mobile(String stud_mobile) {
		this.stud_mobile = stud_mobile;
	}
	public LocalDate getStud_DOB() {
		return stud_DOB;
	}
	public void setStud_DOB(LocalDate stud_DOB) {
		this.stud_DOB = stud_DOB;
	}
	public String getStud_pass() {
		return stud_pass;
	}
	public void setStud_pass(String stud_pass) {
		this.stud_pass = stud_pass;
	}
	public String getStud_cpass() {
		return stud_cpass;
	}
	public void setStud_cpass(String stud_cpass) {
		this.stud_cpass = stud_cpass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	

}
