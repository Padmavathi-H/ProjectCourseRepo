package com.onlineCourse.beans;

import java.time.LocalDate;

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
public class Registrar {
	
	//this is the registrar class
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer Reg_id;
	
	@NotEmpty(message = "Name is mandatory")
	@Size(min=3,message = "Minimum size should be 3 charecter")
	private String  Reg_Name;
	
	@Email(message = "Enter Valid Email Address")
	private String  Reg_email;
	
	@Past(message="Date should in the past")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate  Reg_Dob;
	
	@NotEmpty(message="must slecet gender")
	private String  Reg_gender;
	
	private String Reg_mobile;
	
	private String  Reg_YOExp;
	
	private String  Reg_pass;
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Registrar [Reg_id=" + Reg_id + ", Reg_Name=" + Reg_Name + ", Reg_email=" + Reg_email + ", Reg_Dob="
				+ Reg_Dob + ", Reg_gender=" + Reg_gender + ", Reg_mobile=" + Reg_mobile + ", Reg_YOExp=" + Reg_YOExp
				+ ", Reg_pass=" + Reg_pass + "]";
	}


	public Registrar() {
		super();
	}
	
	
	public Registrar(Integer reg_id,
			@NotEmpty(message = "Name is mandatory") @Size(min = 3, message = "Minimum size should be 3 charecter") String reg_Name,
			@Email(message = "Enter Valid Email Address") String reg_email,
			@Past(message = "Date should in the past") LocalDate reg_Dob,
			@NotEmpty(message = "must slecet gender") String reg_gender, String reg_mobile, String reg_YOExp,
			String reg_pass) {
		super();
		Reg_id = reg_id;
		Reg_Name = reg_Name;
		Reg_email = reg_email;
		Reg_Dob = reg_Dob;
		Reg_gender = reg_gender;
		Reg_mobile = reg_mobile;
		Reg_YOExp = reg_YOExp;
		Reg_pass = reg_pass;
	}


	public Integer getReg_id() {
		return Reg_id;
	}
	public void setReg_id(Integer reg_id) {
		Reg_id = reg_id;
	}
	public String getReg_Name() {
		return Reg_Name;
	}
	public void setReg_Name(String reg_Name) {
		Reg_Name = reg_Name;
	}
	public String getReg_email() {
		return Reg_email;
	}
	public void setReg_email(String reg_email) {
		Reg_email = reg_email;
	}
	public LocalDate getReg_Dob() {
		return Reg_Dob;
	}
	public void setReg_Dob(LocalDate reg_Dob) {
		Reg_Dob = reg_Dob;
	}
	public String getReg_gender() {
		return Reg_gender;
	}
	public void setReg_gender(String reg_gender) {
		Reg_gender = reg_gender;
	}
	public String getReg_YOExp() {
		return Reg_YOExp;
	}
	public void setReg_YOExp(String reg_YOExp) {
		Reg_YOExp = reg_YOExp;
	}
	public String getReg_pass() {
		return Reg_pass;
	}
	public void setReg_pass(String reg_pass) {
		Reg_pass = reg_pass;
	}


	public String getReg_mobile() {
		return Reg_mobile;
	}


	public void setReg_mobile(String reg_mobile) {
		Reg_mobile = reg_mobile;
	}
	
	
	
	
	
}
