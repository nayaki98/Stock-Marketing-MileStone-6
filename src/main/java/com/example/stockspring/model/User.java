package com.example.stockspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="user")
public class User {
	
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="id")	
private int userId;

@NotEmpty(message="please enter username")
@Column(name="username")
private String userName;

@NotEmpty(message="please enter password")
@Column(name="password")
private String password;

@Column(name="usertype")
private String userType;

@NotEmpty(message="please enter valid emailID")
@Column(name="email")
private String email;

@NotEmpty(message="please enter mobileNumber")
@Column(name="mobilenumber")
private String mobileNumber;

@Column(name="confirmed")
private boolean confirmed;


public String getUserName() {
	return userName;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUserType() {
	return userType;
}
public void setUserType(String userType) {
	this.userType = userType;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
/*public boolean isConfirmed() {
	return confirmed;zdafguy
}                                                                           
public void setConfirmed(boolean confirmed) {
	this.confirmed = confirmed;
}*/



}
