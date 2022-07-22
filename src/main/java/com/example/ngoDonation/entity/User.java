package com.example.ngoDonation.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="USER")
public class User {
	@Id
	private String email;
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private int id;
	private String firstName;
	private String lastName;
	private boolean admin; //true is admin
	@OneToMany(mappedBy = "donation", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Donation> donations;
}
