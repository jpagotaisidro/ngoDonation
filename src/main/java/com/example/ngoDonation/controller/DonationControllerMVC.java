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
import com.example.ngoDonation.entity.Donation;
import com.example.ngoDonation.service.AdminService;
import com.example.ngoDonation.service.DonationService;

@Controller
public class DonationControllerMVC {
	
	@Autowired
	DonationService donationService;
	
	@RequestMapping("/mvc/new_donation")
	public String showForm(Model model) {
		Donation donation = new Donation();
		model.addAttribute(donation);
		return "new_donation";
	}
	
	@RequestMapping(value="/save_donation",method = RequestMethod.POST)
	public String saveDonation(@ModelAttribute("donation") Donation donation) {
		donationService.createDonation(donation);
		return "redirect:/donations";
}
	
	@RequestMapping("/donation_index")
    public String donations(Model model) {
        List<Donation> list_of_donations = donationService.getAllDonation();
        model.addAttribute("donations",list_of_donations);
         return "donation_index";
}

}
