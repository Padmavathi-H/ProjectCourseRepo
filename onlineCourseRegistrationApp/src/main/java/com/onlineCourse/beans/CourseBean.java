package com.onlineCourse.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Entity
public class CourseBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int c_Id;
	
	@NotEmpty(message = "Mandotory")
	private String c_Name;
	@NotEmpty(message = "Mandotory")
	private String c_Duration;
	@NotNull(message = "Mandotory")
	private int c_Fees;
	@NotNull(message = "Mandotory")
	private int c_Capacity;
	@NotNull(message = "Mandotory")
	private int c_Seats;
	
	public CourseBean() {
		
	}

	public CourseBean(int c_Id, @NotEmpty(message = "Mandotory") String c_Name,
			@NotEmpty(message = "Mandotory") String c_Duration, @NotEmpty(message = "Mandotory") int c_Fees,
			@NotEmpty(message = "Mandotory") int c_Capacity, @NotEmpty(message = "Mandotory") int c_Seats) {
		super();
		this.c_Id = c_Id;
		this.c_Name = c_Name;
		this.c_Duration = c_Duration;
		this.c_Fees = c_Fees;
		this.c_Capacity = c_Capacity;
		this.c_Seats = c_Seats;
	}

	public int getC_Id() {
		return c_Id;
	}

	public void setC_Id(int c_Id) {
		this.c_Id = c_Id;
	}

	public String getC_Name() {
		return c_Name;
	}

	public void setC_Name(String c_Name) {
		this.c_Name = c_Name;
	}

	public String getC_Duration() {
		return c_Duration;
	}

	public void setC_Duration(String c_Duration) {
		this.c_Duration = c_Duration;
	}

	public int getC_Fees() {
		return c_Fees;
	}

	public void setC_Fees(int c_Fees) {
		this.c_Fees = c_Fees;
	}

	public int getC_Capacity() {
		return c_Capacity;
	}

	public void setC_Capacity(int c_Capacity) {
		this.c_Capacity = c_Capacity;
	}

	public int getC_Seats() {
		return c_Seats;
	}

	public void setC_Seats(int c_Seats) {
		this.c_Seats = c_Seats;
	}

	@Override
	public String toString() {
		return "CourseBean [c_Id=" + c_Id + ", c_Name=" + c_Name + ", c_Duration=" + c_Duration + ", c_Fees=" + c_Fees
				+ ", c_Capacity=" + c_Capacity + ", c_Seats=" + c_Seats + "]";
	}
	
	

}
