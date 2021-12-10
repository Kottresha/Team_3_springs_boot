package com.ltts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ltts.Entity.User;
import com.ltts.repository.UserRepository;

@SpringBootApplication
public class HotelReservationApplication {

	static ConfigurableApplicationContext cont = null;
	
	public static void main(String[] args) {
		HotelReservationApplication.cont = SpringApplication.run(HotelReservationApplication.class, args);
		
	}

}
