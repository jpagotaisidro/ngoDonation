package com.example.ngoDonation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ngoDonation.entity.User;
import com.example.ngoDonation.repo.UserRepository;

@Service
public class AdminService {

	@Autowired
	private UserRepository userRepo;
	
	public void createUser(User user) {
		userRepo.save(user);
	}
	
	//delete user
	public void deleteUser(int id) {
		userRepo.deleteById(id);;
	}
	
	public List<User> getAllUser(){
		List<User> users = userRepo.findAll();
		return users;
	}
	
	public User getUser(int id) {
		return userRepo.findById(id).get(); 
	}
	
	public void update(User u, int id) {
		User original = this.getUser(id);
		original.setFirstName(u.getFirstName());
		original.setLastName(u.getLastName());
		original.setEmail(u.getEmail());
		original.setAdmin(u.isAdmin());
		userRepo.save(original);
	}
	
}
