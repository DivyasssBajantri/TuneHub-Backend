package com.kodnest.service;

import com.kodnest.entity.User;


public interface UserService {

	
	boolean validUser(String name, String artist);

	String getRole(String name);


	void saveUser(User user);

	boolean emailExists(User user);

	User getUser(String mail);

	void updateUser(User user);


	
}