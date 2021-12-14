package com.api.vehiclemicroservices.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.vehiclemicroservices.Entity.Vehicle;
import com.api.vehiclemicroservices.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	private VehicleService vehicleService;
	
	@PostMapping("/addvehicle")
	public ResponseEntity<Vehicle> addvehicle(@RequestBody Vehicle vehicle) {
		Vehicle v = null;
		try {
			v = this.vehicleService.addvehicle(vehicle);
			return ResponseEntity.of(Optional.of(v));

		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}

	// getvehicle
	@GetMapping("/getvehicle")
	public ResponseEntity<Vehicle> getvehicle(@RequestParam("vehicleid") Long vehicleid) {
		System.out.println("********************");
		Vehicle vehicle = vehicleService.getvehicle(vehicleid);
		
		return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
	}

}
