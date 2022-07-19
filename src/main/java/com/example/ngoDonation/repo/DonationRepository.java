package com.example.ngoDonation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ngoDonation.entity.Donation;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Integer>{

}
