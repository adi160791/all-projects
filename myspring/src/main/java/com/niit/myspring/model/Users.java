package com.niit.myspring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity

public class Users implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="userid")
	private int userId;
	@NotEmpty(message = "enter User Name")
	private String userName;
	@NotEmpty(message = "enter Password")
	
	private String userAddress;
	
		public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Users()
	{
	}
}

 
