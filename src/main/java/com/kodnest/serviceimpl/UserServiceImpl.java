package com.kodnest.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.entity.User;
import com.kodnest.repository.UserRepository;
import com.kodnest.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public boolean emailExists(User user) {

		User existinguser = userRepository.findByEmail(user.getEmail());

		if(existinguser!=null) {
			System.out.println("Present");
			return true;
		}
		else {
			System.out.println("Absent");
			return false;
		}

	}

	@Override
	public boolean validUser(String email, String password) {	
		User user = userRepository.findByEmail(email);
		String dbpwd = user.getPassword();

		if(password.equals(dbpwd)) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String getRole(String email) {
		User user = userRepository.findByEmail(email);
		return user.getRole();
	}

	@Override
	public User getUser(String mail) {
		
		return userRepository.findByEmail(mail);
	}

	@Override
	public void updateUser(User user) {
	userRepository.save(user);
	}
}
