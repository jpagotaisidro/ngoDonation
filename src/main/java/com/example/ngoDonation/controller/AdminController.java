package com.example.ngoDonation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.ngoDonation.entity.User;
import com.example.ngoDonation.service.AdminService;

@RestController
public class AdminController {

		@Autowired
		private AdminService adminService;
		
		//list of users
		@GetMapping("/users")
		public String getUsers() {
			return "users";
		}
		
		//add new user
		@RequestMapping(value = "/adduser", method = {RequestMethod.GET, RequestMethod.POST})
		public String addUser(Model model) {
			model.addAttribute("user", new User());
	        return "adduser";
		}
		
		//edit user
		@GetMapping("/edituser")
		public String editUser() {
			return "edituser";
		}
}
