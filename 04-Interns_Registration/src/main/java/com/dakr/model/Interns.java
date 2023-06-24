package com.dakr.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
//import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name="Interns_Details")
public class Interns {
	
	@Id
	private Integer internID;
	
	
	@NotEmpty
	@Size(min=4,message="user name must be 4 char")
	private String  firstName;
	
	@NotEmpty
	private String  lastName;
	
	@Min(18)
	@Max(100)
	private Integer age;
	
	@Email(message = "Email aadress is not valid") 
	private String  emailId;
	
	//@Pattern(regexp="(^\\d{10}$)",message = "invalid mobile no. entered")
	private long    phoneNo;
	@NotEmpty
	private String  adress;
	
	@NotEmpty
	private String  dob;
	@NotEmpty
	@Size(min=4,max=15,message = "password must bu 4 to 10 char" )
	private String  password;
	
	
	public Integer getInternID() {
		return internID;
	}
	public void setInternID(Integer internID) {
		this.internID = internID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Interns [internID=" + internID + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", adress=" + adress + ", dob=" + dob
				+ ", password=" + password + "]";
	}
	
	
	

}
