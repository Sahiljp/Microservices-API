package com.api.filmsmicrosevices.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.filmsmicrosevices.Entity.Films;
import com.api.filmsmicrosevices.service.FilmsService;



@RestController
@RequestMapping("/films")
public class FilmsController {
	
	@Autowired
	public FilmsService filmsService;
	
	 @PostMapping("/addFilms")
		public ResponseEntity<Films> addContact(@RequestBody Films films){
		 Films f=null;
			try {
				
				f=this.filmsService.addFilms(films);
				return ResponseEntity.of(Optional.of(f));
				
			} catch (Exception e) {
		e.printStackTrace();
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			}
	 }
	 
	 @GetMapping("/{id}")
		public ResponseEntity<Optional<Films>> getFilms(@PathVariable ("id") Long id){
			
			Optional<Films> films= filmsService.getFilms(id);
			return new ResponseEntity<Optional<Films>>(films,HttpStatus.OK);
		}
	 
	 

}
