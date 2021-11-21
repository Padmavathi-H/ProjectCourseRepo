package com.onlineCourse.beans;

import java.sql.Date;
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
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer studid;
	
	@NotEmpty(message = "Name is mandatory!")
	@Size(min=3,message = "Minimum characters should be 3")
	private String  studname;
	
	@Email(message = "Email is mandatory!")
	@Pattern(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.[a-zA-Z0-9+_.-]",message="Enter Valid Email Address")
	private String  studemail;
	
	@NotEmpty(message="Must select gender!")
	private String  gender;
	
	@NotEmpty(message="Must enter address!")
	private String  studaddress;
	
	@NotEmpty(message="Must enter mobile Number!")
	@Pattern(regexp="(^$|[0-9]{10})",message="Must enter 10 digits only!")
	private String studmobile;
	
	@Past(message="Date should be in the past")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate studDOB;
	
	@NotEmpty(message="Must enter a Password!")
	private String studpass;
	
	@NotEmpty(message="Re-enter the Password!")
	private String studcpass;

	@ManyToMany(cascade=CascadeType.ALL,mappedBy="student")
	private List<CourseBean> courses=new ArrayList<>();
	
	
	

	public Student() {
		super();
	}

	public Student(Integer studid,
			@NotEmpty(message = "Name is mandatory") @Size(min = 3, message = "Minimum size should be 3 charecter") String studname,
			@Email(message = "Enter Valid Email Address") String studemail,
			@NotEmpty(message = "must select gender") String gender, String studaddress, String studmobile,
			@Past(message = "Date should in the past") LocalDate studDOB, String studpass, String studcpass,
			List<CourseBean> courses) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.studemail = studemail;
		this.gender = gender;
		this.studaddress = studaddress;
		this.studmobile = studmobile;
		this.studDOB = studDOB;
		this.studpass = studpass;
		this.studcpass = studcpass;
		this.courses = courses;
	}

	public Integer getStudid() {
		return studid;
	}

	public void setStudid(Integer studid) {
		this.studid = studid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public String getStudemail() {
		return studemail;
	}

	public void setStudemail(String studemail) {
		this.studemail = studemail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStudaddress() {
		return studaddress;
	}

	public void setStudaddress(String studaddress) {
		this.studaddress = studaddress;
	}

	public String getStudmobile() {
		return studmobile;
	}

	public void setStudmobile(String studmobile) {
		this.studmobile = studmobile;
	}

	public LocalDate getStudDOB() {
		return studDOB;
	}

	public void setStudDOB(LocalDate studDOB) {
		this.studDOB = studDOB;
	}

	public String getStudpass() {
		return studpass;
	}

	public void setStudpass(String studpass) {
		this.studpass = studpass;
	}

	public String getStudcpass() {
		return studcpass;
	}

	public void setStudcpass(String studcpass) {
		this.studcpass = studcpass;
	}

	public List<CourseBean> getCourses() {
		return courses;
	}

	public void setCourses(List<CourseBean> courses) {
		this.courses = courses;
	}
	
	
	
	
	
}
