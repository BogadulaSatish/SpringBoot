package com.example.demo.Entity;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="UserData")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Integer userId;
	private String userName;
	private String Email;
	
	
	private String MobileNumber;
	
	private String Gender;
	private String SSN;
	private String Active_SW = "Y";
	
	private Date PlanStartDate;
	
	private Date PlanEndDate;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	public String getActive_SW() {
		return Active_SW;
	}
	public void setActive_SW(String active_SW) {
		Active_SW = active_SW;
	}
	public Date getPlanStartDate() {
		return PlanStartDate;
	}
	public void setPlanStartDate(Date planStartDate) {
		PlanStartDate = planStartDate;
	}
	public Date getPlanEndDate() {
		return PlanEndDate;
	}
	public void setPlanEndDate(Date planEndDate) {
		PlanEndDate = planEndDate;
	}

	
	
	
	

}
