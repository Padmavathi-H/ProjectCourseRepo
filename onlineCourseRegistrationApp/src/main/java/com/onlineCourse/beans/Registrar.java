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



@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer regId;

@NotEmpty(message = "Name is mandatory")
@Size(min=3,message = "Minimum size should be 3 charecter")
private String  regName;

@Email(message = "Enter Valid Email Address")
private String  regEmail;

@Past(message="Date should in the past")
@DateTimeFormat(iso=ISO.DATE)
private LocalDate  regDob;

@NotEmpty(message="must slecet gender")
private String  regGender;

private String regMobile;

private String  regYOExp;

private String  regPass;

public Registrar()
{

}

public Registrar(Integer regId,
@NotEmpty(message = "Name is mandatory") @Size(min = 3, message = "Minimum size should be 3 charecter") String regName,
@Email(message = "Enter Valid Email Address") String regEmail,
@Past(message = "Date should in the past") LocalDate regDob,
@NotEmpty(message = "must slecet gender") String regGender, String regMobile, String regYOExp,
String regPass) {
super();
this.regId = regId;
this.regName = regName;
this.regEmail = regEmail;
this.regDob = regDob;
this.regGender = regGender;
this.regMobile = regMobile;
this.regYOExp = regYOExp;
this.regPass = regPass;
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

@Override
public String toString() {
return "Registrar [regId=" + regId + ", regName=" + regName + ", regEmail=" + regEmail + ", regDob=" + regDob
+ ", regGender=" + regGender + ", regMobile=" + regMobile + ", regYOExp=" + regYOExp + ", regPass="
+ regPass + "]";
}
}