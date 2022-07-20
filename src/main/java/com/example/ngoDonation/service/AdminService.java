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
	public void deleteUser(User user) {
		userRepo.delete(user);
	}
	
	//edit user
	public boolean editUser(int id) {
		User temp = userRepo.findUserById(id);
		temp.setAdmin(!temp.isAdmin());
		userRepo.save(temp);
		return temp.isAdmin();
	}
}
