package com.onlineCourse.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Registrar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer regId;

	@NotEmpty(message = "Name is mandatory!")
	@Size(min = 3, message = "Minimum size should be 3 charecter")
	private String regName;

	@Email(message = "Email is mandatory!")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.[a-zA-Z0-9+_.-]",message="Enter Valid Email Address")
	private String regEmail;

	@Past(message = "Date should be in the past")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate regDob;

	@NotEmpty(message = "Must select gender!")
	private String regGender;
    
	@NotEmpty(message="Must enter mobile Number!")
	private String regMobile;

	@NotEmpty(message="Must enter Experience!")
	private String regYOExp;
    
	@NotEmpty(message="Must enter a Password!")
	private String regPass;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="registrar")
	private List<CourseBean> courses=new ArrayList<>();

	public Registrar() {

	}

	

	public Registrar(Integer regId,
			@NotEmpty(message = "Name is mandatory") @Size(min = 3, message = "Minimum size should be 3 charecter") String regName,
			@Email(message = "Enter Valid Email Address") String regEmail,
			@Past(message = "Date should in the past") LocalDate regDob,
			@NotEmpty(message = "must slecet gender") String regGender, String regMobile, String regYOExp,
			String regPass, List<CourseBean> courses) {
		super();
		this.regId = regId;
		this.regName = regName;
		this.regEmail = regEmail;
		this.regDob = regDob;
		this.regGender = regGender;
		this.regMobile = regMobile;
		this.regYOExp = regYOExp;
		this.regPass = regPass;
		this.courses = courses;
	}



	public Integer getRegId() {
		return regId;
	}

	public void setRegId(Integer regId) {
		this.regId = regId;
	}

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	public String getRegEmail() {
		return regEmail;
	}

	public void setRegEmail(String regEmail) {
		this.regEmail = regEmail;
	}

	public LocalDate getRegDob() {
		return regDob;
	}

	public void setRegDob(LocalDate regDob) {
		this.regDob = regDob;
	}

	public String getRegGender() {
		return regGender;
	}

	public void setRegGender(String regGender) {
		this.regGender = regGender;
	}

	public String getRegMobile() {
		return regMobile;
	}

	public void setRegMobile(String regMobile) {
		this.regMobile = regMobile;
	}

	public String getRegYOExp() {
		return regYOExp;
	}

	public void setRegYOExp(String regYOExp) {
		this.regYOExp = regYOExp;
	}

	public String getRegPass() {
		return regPass;
	}

	public void setRegPass(String regPass) {
		this.regPass = regPass;
	}
	
	

	public List<CourseBean> getCourses() {
		return courses;
	}



	public void setCourses(List<CourseBean> courses) {
		this.courses = courses;
	}



	
}