package com.example.ngoDonation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ngoDonation.entity.Donation;
import com.example.ngoDonation.repo.DonationRepository;

@Service
public class DonationService {

	@Autowired
	private DonationRepository donationRepo;
	
	public Donation createDonation(Donation donation) {
		donationRepo.save(donation);
		return donation;
	}
	
	public List<Donation> getAllDonation(){
		List<Donation> donations = donationRepo.findAll();
		return donations;
	}
}
