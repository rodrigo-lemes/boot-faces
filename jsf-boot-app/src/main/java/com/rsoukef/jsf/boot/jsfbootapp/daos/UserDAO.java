package com.rsoukef.jsf.boot.jsfbootapp.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rsoukef.jsf.boot.jsfbootapp.models.User;
import com.rsoukef.jsf.boot.jsfbootapp.repositories.UserRepository;

@Component
public class UserDAO {

	@Autowired
	private UserRepository repository;

	public User saveUser(User userData) {
		
		return repository.save(userData);

	}

}
