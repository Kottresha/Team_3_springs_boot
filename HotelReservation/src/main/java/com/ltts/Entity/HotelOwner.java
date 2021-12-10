package com.ltts.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class HotelOwner {

	@Id
	String hotelOwnerUserName;
	String hotelOwnerUserId;
	String hotelName;
	String hotelId;
	String hotelCity;
	public String getHotelOwnerUserName() {
		return hotelOwnerUserName;
	}
	public void setHotelOwnerUserName(String hotelOwnerUserName) {
		this.hotelOwnerUserName = hotelOwnerUserName;
	}
	public String getHotelOwnerUserId() {
		return hotelOwnerUserId;
	}
	public void setHotelOwnerUserId(String hotelOwnerUserId) {
		this.hotelOwnerUserId = hotelOwnerUserId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	
	@Override
	public String toString() {
		return "Hotel Owner " + this.getHotelOwnerUserName() + ", " + this.getHotelName() + ", " + this.getHotelCity() + "]";
	}
	
}
