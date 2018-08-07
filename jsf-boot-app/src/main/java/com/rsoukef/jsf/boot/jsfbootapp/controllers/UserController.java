package com.rsoukef.jsf.boot.jsfbootapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rsoukef.jsf.boot.jsfbootapp.daos.UserDAO;
import com.rsoukef.jsf.boot.jsfbootapp.models.User;

@Component
public class UserController {
	
	@Autowired
	private UserDAO userDAO;
	
	private User userData = new User();
	
	public void createUser(){
		userDAO.saveUser(userData);
	}
	
	public String showGreeting(){
		return "Done";
	}

	public User getUserData(){
		return this.userData;
	}
	
	public void setUserData(User userData){
		this.userData = userData; 
	}
	
	
}
