package com.example.HousesAndOfficesToLet;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment,Integer> {

	List<Apartment> findByapartmentlocationContainingIgnoreCase(String apartmentlocation);

	Apartment deleteApartmentByapartmentname(String apartmentname);

}
