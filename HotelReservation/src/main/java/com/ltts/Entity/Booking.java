package com.ltts.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	String userId;
	String hotelId;
	LocalDate checkin;
	LocalDate checkout;
	boolean payment;
	float amount;

}
