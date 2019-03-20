package com.niit.myspring.dao;

import java.util.List;

import com.niit.myspring.model.*;



public interface UsersDao 
{
	
	public void addUsers(Users users);
	public List<Users> viewUsers();
	public void updateUsers(Users users);
	public Users getUsersById(int userId);
	public void deleteUsersById(int userId);
	
	
	

}
