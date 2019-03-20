package com.niit.myspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User
{
	@Id
	@GeneratedValue
	int userId;
	String userName;
	String userAddress;
	
	public int getUserId() 
	{
		return userId;
	}
	public void setUserId(int userId) 
	{
		this.userId = userId;
	}
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getUserAddress() 
	{
		return userAddress;
	}
	public void setUserAddress(String userAddress) 
        {
		this.userAddress = userAddress;
	}
	
	
}
