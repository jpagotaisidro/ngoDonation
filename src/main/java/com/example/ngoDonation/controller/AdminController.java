package com.example.ngoDonation.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.ngoDonation.entity.Donation;
import com.example.ngoDonation.entity.User;
import com.example.ngoDonation.service.AdminService;
import com.example.ngoDonation.service.DonationService;

@RestController
public class AdminController {

		@Autowired
		private AdminService adminService;

		@GetMapping("/")
		public String blank() {
			return "Welcome to NGO Donation <br>"
					+ "<ul>\r\n"
					+ "  		<li><a href=\"/\">Home</a></li>\r\n"
					+ "  		<li><a href=\"/user_index\">Users</a></li>\r\n"
					+ "  		<li><a href=\"mvc/new_user\">New User</a></li>\r\n"
					+ "  		<li><a href=\"/donation_index\">Donation Index</a></li>\r\n"
					+ "  		<li><a href=\"mvc/new_donation\">New Donation</a></li>\r\n"
					+ "	</ul>";
		}
		
		//list of users
		@GetMapping("/users")
		public List<User> users() {
			return adminService.getAllUser();
		}
		
		//add new user
//		@RequestMapping(value = "/adduser", method = {RequestMethod.GET, RequestMethod.POST})
//		public String addUser(Model model) {
//			model.addAttribute("user", new User());
//	        return "adduser";
//		}
		@PostMapping("/users")
		public void add(@RequestBody User user) {
			adminService.createUser(user);
		}
		
		
		//edit user
//		@GetMapping("/edituser")
//		public String editUser() {
//			return "edituser";
//		}
		
		@PutMapping("/users/{id}")
		public ResponseEntity<?> update(@RequestBody User user, @PathVariable int id) {
			try {
				System.out.println("test");
				adminService.update(user, id);
				return new ResponseEntity<>(HttpStatus.OK);
			} catch (NoSuchElementException e) {
				System.out.println("test1");
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		}
		
		@DeleteMapping("/users/{id}")
		public void delete(@PathVariable Integer id) {
			adminService.deleteUser(id);
		}
		
}
