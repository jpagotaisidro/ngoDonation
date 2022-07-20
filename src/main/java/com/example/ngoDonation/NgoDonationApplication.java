package com.example.ngoDonation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

//import com.example.demo.CountriesApplication;

//@SpringBootApplication
//public class NgoDonationApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(NgoDonationApplication.class, args);
//	}
//
//}

@SpringBootApplication
public class NgoDonationApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(NgoDonationApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(NgoDonationApplication.class);
	}

}

//@SpringBootApplication
//public class CountriesApplication extends SpringBootServletInitializer{
//
//	public static void main(String[] args) {
//		SpringApplication.run(CountriesApplication.class, args);
//	}
//	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(CountriesApplication.class);
//	}
//
//}