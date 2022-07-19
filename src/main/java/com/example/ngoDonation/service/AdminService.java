package com.example.ngoDonation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ngoDonation.entity.User;
import com.example.ngoDonation.repo.UserRepository;

@Service
public class AdminService {

	@Autowired
	private UserRepository userRepo;
	
	public User createUser(User user) {
		userRepo.save(user);
		return user;
	}
	
	//delete user
	public void deleteUser() {
		
	}
	
	//edit user
	public User editUser(User user) {
		return user;
	}
}
