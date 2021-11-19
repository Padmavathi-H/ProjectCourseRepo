package com.onlineCourse.beans;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//course bean

@Entity
public class CourseBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cId;
	
	
	@NotEmpty(message = "Mandotory")
	private String cName;
	
	
	@NotEmpty(message = "Mandotory")
	private String cDuration;
	
	
	@NotNull(message = "Mandotory")
	private Integer cFees;
	
	
	@NotNull(message = "Mandotory")
	private Integer cCapacity;
	
	
	@NotNull(message = "Mandotory")
	private Integer cSeats;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Student> student=new ArrayList<>();


	
	
	
	
	@Override
	public String toString() {
		return "CourseBean [cId=" + cId + ", cName=" + cName + ", cDuration=" + cDuration + ", cFees=" + cFees
				+ ", cCapacity=" + cCapacity + ", cSeats=" + cSeats + ", student=" + student + "]";
	}


	public CourseBean() {
		super();
	}


	public CourseBean(Integer cId, @NotEmpty(message = "Mandotory") String cName,
			@NotEmpty(message = "Mandotory") String cDuration, @NotNull(message = "Mandotory") Integer cFees,
			@NotNull(message = "Mandotory") Integer cCapacity, @NotNull(message = "Mandotory") Integer cSeats,
			List<Student> student) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cDuration = cDuration;
		this.cFees = cFees;
		this.cCapacity = cCapacity;
		this.cSeats = cSeats;
		this.student = student;
	}


	public Integer getcId() {
		return cId;
	}


	public void setcId(Integer cId) {
		this.cId = cId;
	}


	public String getcName() {
		return cName;
	}


	public void setcName(String cName) {
		this.cName = cName;
	}


	public String getcDuration() {
		return cDuration;
	}


	public void setcDuration(String cDuration) {
		this.cDuration = cDuration;
	}


	public Integer getcFees() {
		return cFees;
	}


	public void setcFees(Integer cFees) {
		this.cFees = cFees;
	}


	public Integer getcCapacity() {
		return cCapacity;
	}


	public void setcCapacity(Integer cCapacity) {
		this.cCapacity = cCapacity;
	}


	public Integer getcSeats() {
		return cSeats;
	}


	public void setcSeats(Integer cSeats) {
		this.cSeats = cSeats;
	}


	public List<Student> getStudent() {
		return student;
	}


	public void setStudent(List<Student> student) {
		this.student = student;
	}



	
	
	


	
}
