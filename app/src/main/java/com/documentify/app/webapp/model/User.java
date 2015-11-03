package com.documentify.app.webapp.model;

import java.math.BigInteger;
import java.util.Date;

public class User {
	
private String id;
private String firstName;
private String lastName;
private String userName;
private String password;
private BigInteger points;
private Date lastLoginDate;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
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
public String getUserName() {
	return userName;
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
public BigInteger getPoints() {
	return points;
}
public void setPoints(BigInteger points) {
	this.points = points;
}
public Date getLastLoginDate() {
	return lastLoginDate;
}
public void setLastLoginDate(Date lastLoginDate) {
	this.lastLoginDate = lastLoginDate;
}
@Override
public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
			+ ", password=" + password + ", points=" + points + ", lastLoginDate=" + lastLoginDate + "]";
}


}
