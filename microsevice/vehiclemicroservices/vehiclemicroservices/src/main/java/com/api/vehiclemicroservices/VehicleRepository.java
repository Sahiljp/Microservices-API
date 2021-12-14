package com.api.vehiclemicroservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.api.vehiclemicroservices.Entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	@Query("SELECT m FROM Vehicle m WHERE m.id= :vehicleid" )
	Vehicle findvehiclebyid(Long vehicleid);
	
}
