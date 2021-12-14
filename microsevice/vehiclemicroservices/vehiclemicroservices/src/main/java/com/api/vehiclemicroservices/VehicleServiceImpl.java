package com.api.vehiclemicroservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.vehiclemicroservices.Entity.Films;
import com.api.vehiclemicroservices.Entity.Vehicle;
import com.api.vehiclemicroservices.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	public VehicleRepository vehiclerepository;

	@Autowired
	public RestTemplate restTemplate;

	@Override
	public Vehicle addvehicle(Vehicle vehicle) {
		return vehiclerepository.save(vehicle);
	}

	@Override
	public Vehicle getvehicle(Long vehicleid) {
		Vehicle vehical = vehiclerepository.findvehiclebyid(vehicleid);
//		List<Films> films = this.restTemplate
//				.getForObject("http://films/films/id" + vehical.getId(), List.class);
//		vehical.setFilm(films);
		return vehical;
	}

}
