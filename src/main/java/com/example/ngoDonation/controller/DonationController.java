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
import com.example.ngoDonation.service.DonationService;

@RestController
public class DonationController {

		@Autowired
		private DonationService donationService;
		
		//list of donations
		@GetMapping("/donations")
		public List<Donation> getUsers(ModelMap model) {
			List<Donation> list= donationService.getAllDonation();
		     model.addAttribute("result", list);
		     return list; 
		}
}