package com.example.HousesAndOfficesToLet;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;

@Validated
@SuppressWarnings("deprecation")
@Transactional
@Entity
@Table(name="apartment")
public class Apartment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int apartmentId;
	
	@Column(nullable=true,length=30)
private String apartmentname;

	@NotNull
	@Column(nullable=false,length=30)
private String apartmentlocation;
	@NotNull
	@Column(length=15)
private String google_search_code;
	@NotNull
	@Column(nullable=false,length=30)
private String room_type;
	@NotNull
	@Column(nullable=false,length=255)
private String room_description;
	@NotNull
	@Column(nullable=false,length=30)
private String payment_period;
	@NotNull
	@Column(nullable=false)
private double rent_amount;
	@NotNull
	@Column(nullable=false)
private int vacantrooms;
	@NotNull
	@Column(nullable=false,length=30)
private String contactpartyname;
	@NotNull
	@Column(nullable=false,length=12)
private String contactpartyphonenumber;
public String getApartmentname() {
	return apartmentname;
}
public void setApartmentname(String apartmentname) {
	this.apartmentname = apartmentname;
}
public String getApartmentlocation() {
	return apartmentlocation;
}
public void setApartmentlocation(String apartmentlocation) {
	this.apartmentlocation = apartmentlocation;
}
public String getGoogle_search_code() {
	return google_search_code;
}
public void setGoogle_search_code(String google_search_code) {
	this.google_search_code = google_search_code;
}
public String getRoom_type() {
	return room_type;
}
public void setRoom_type(String room_type) {
	this.room_type = room_type;
}
public String getRoom_description() {
	return room_description;
}
public void setRoom_description(String room_description) {
	this.room_description = room_description;
}
public String getPayment_period() {
	return payment_period;
}
public void setPayment_period(String payment_period) {
	this.payment_period = payment_period;
}
public double getRent_amount() {
	return rent_amount;
}
public void setRent_amount(double rent_amount) {
	this.rent_amount = rent_amount;
}
public int getVacantrooms() {
	return vacantrooms;
}
public void setVacantrooms(int vacantrooms) {
	this.vacantrooms = vacantrooms;
}
public String getContactpartyname() {
	return contactpartyname;
}
public void setContactpartyname(String contactpartyname) {
	this.contactpartyname = contactpartyname;
}
public String getContactpartyphonenumber() {
	return contactpartyphonenumber;
}
public void setContactpartyphonenumber(String contactpartyphonenumber) {
	this.contactpartyphonenumber = contactpartyphonenumber;
}
@Override
public String toString() {
	return "apartment [apartmentname=" + apartmentname + ", apartmentlocation=" + apartmentlocation
			+ ", google_search_code=" + google_search_code + ", room_type=" + room_type + ", room_description="
			+ room_description + ", payment_period=" + payment_period + ", rent_amount=" + rent_amount
			+ ",vacantrooms="+vacantrooms+", contactpartyname=" + contactpartyname + ", contactpartyphonenumber="
			+ contactpartyphonenumber + "]";
}

}
