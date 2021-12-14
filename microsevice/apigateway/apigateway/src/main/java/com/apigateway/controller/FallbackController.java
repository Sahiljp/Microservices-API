package com.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	
	@GetMapping("/vehicleFallback")
	public String vehicleServiceFallback() {
		return "vehicle Service is down at this time!!";
	}
	
	
	@GetMapping("/filmsFallback")
	public String filmsServiceFallback() {
		return "films Service is down at this time!!";
	}

}
