package com.example.demo.UserBean;

import java.sql.Date;

import org.springframework.stereotype.Component;



@Component
public class UserBean {
	

	private Integer userId;
	private String userName;
	private String Email;
	private Integer MobileNumber;
	private String Gender;
	private Integer SSN;
	private String Active_SW;
	private Date CreateDate;
	private Date UpdateDate;
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
	public Integer getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(Integer mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public Integer getSSN() {
		return SSN;
	}
	public void setSSN(Integer sSN) {
		SSN = sSN;
	}
	public String getActive_SW() {
		return Active_SW;
	}
	public void setActive_SW(String active_SW) {
		Active_SW = active_SW;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public Date getUpdateDate() {
		return UpdateDate;
	}
	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}
	
	
	
	

}
