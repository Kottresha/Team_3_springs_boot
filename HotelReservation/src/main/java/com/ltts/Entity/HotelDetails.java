package com.ltts.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hotelinfo")
public class HotelDetails {

	
	@Id
	int numberOfRooms;
	int TwoSharingRooms;
	int SingleRoom;
	String hotelId;
	String hotelAddress;
	
}
