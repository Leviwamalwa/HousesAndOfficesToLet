package com.example.HousesAndOfficesToLet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ApartmentController {
	@Autowired
	ApartmentRepository ApartmentRepository;
	@GetMapping("apartment")
	public String apartment() {
		return "apartment";
	}
	@GetMapping("disclaimer")
	public String about() {
		return "disclaimer";
	}
	@GetMapping("/")
	public String viewapartments() {
		return "viewApartments";
		}
	@GetMapping("deleteApartment")
	public String deleteApartment() {
		return "deleteApartment";
	}
	@GetMapping("updateApartment")
	public String updateApartment() {
		return "updateApartment";
	}
	@GetMapping("/viewApartments/{apartmentlocation}")
	@ResponseBody
	public List<Apartment>getApartmentByLocation( String apartmentlocation) {
		return ApartmentRepository.findByapartmentlocationContainingIgnoreCase(apartmentlocation);
	}
	@PostMapping(path="/")
	@ResponseBody
	public Apartment saveApartment( Apartment apartment) {
		ApartmentRepository.save(apartment);
		return apartment;
	}
   @GetMapping(path="/apartments")
   @ResponseBody
   public List<Apartment> getApartment( Pageable pageable){
	   return ApartmentRepository.findAll();
   }
   @GetMapping(path="/home/{apartmentId}")
   @ResponseBody
   public Optional<Apartment> getApartment(@PathVariable("apartmentId")int apartmentId){
	   return ApartmentRepository.findById(apartmentId);
   }
 @DeleteMapping(path="/deleteApartment/{apartmentname}")
 @ResponseBody
 public Apartment deleteApartmentByapartmentname(String apartmentname) {
	 return ApartmentRepository.deleteApartmentByapartmentname(apartmentname);
 }
 @PutMapping(path="/updateApartment")
 @ResponseBody
 public Apartment updateApartment(@RequestBody Apartment apartment) {
	 ApartmentRepository.save(apartment);
	 return apartment;
 }
}
