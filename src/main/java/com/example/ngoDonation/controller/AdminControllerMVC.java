package com.example.ngoDonation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.ngoDonation.entity.Donation;
import com.example.ngoDonation.entity.User;
import com.example.ngoDonation.service.AdminService;

@Controller
public class AdminControllerMVC {
	
	@Autowired
	AdminService adminService;
	
	@RequestMapping("/mvc/new_user")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute(user);
		return "new_user";
	}
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {
		adminService.createUser(user);
		return "redirect:/user_index";
}
	
	@RequestMapping("/user_index")
    public String users(Model model) {
        List<User> list_of_users = adminService.getAllUser();
        model.addAttribute("users",list_of_users);
         return "user_index";
}

}
