package com.example.ngoDonation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ngoDonation.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
