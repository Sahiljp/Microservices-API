package com.api.vehiclemicroservices.service;

import com.api.vehiclemicroservices.Entity.Vehicle;

public interface VehicleService {
	
	public Vehicle addvehicle(Vehicle vehicle);

	public Vehicle getvehicle(Long vehicleid);


}
