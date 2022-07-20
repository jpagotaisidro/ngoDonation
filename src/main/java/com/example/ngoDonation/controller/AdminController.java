package com.example.ngoDonation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.ngoDonation.entity.Donation;
import com.example.ngoDonation.entity.User;
// import com.example.ngoDonation.repo.DonationRepository;
import com.example.ngoDonation.service.AdminService;
import com.example.ngoDonation.service.DonationService;

@RestController
public class AdminController {

		@Autowired
		private AdminService adminService;

		@Autowired
		private DonationService donationService;
		
		// @Autowired
		// private DonationRepository donationRepo;
		
		@GetMapping("/")
		public String blank() {
			return "hi this is root string";
		}
		
		//list of users
		@GetMapping("/users")
		public List<User> getUsers(ModelMap model) {
			List<User> list= adminService.getAllUser();
		     model.addAttribute("result", list);
		     return list; 
		}
		
		@GetMapping("/donations")
		public List<Donation> getDonations(ModelMap model) {
			List<Donation> list= donationService.getAllDonation();
		     model.addAttribute("result", list);
		     return list; 
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
		
//		@RequestMapping("/users")
//	    public ModelAndView getUsers() {
//	        ModelAndView modelAndView = new ModelAndView();
//	        modelAndView.setViewName("users.html");
//	        return modelAndView;
//	    }  
}
