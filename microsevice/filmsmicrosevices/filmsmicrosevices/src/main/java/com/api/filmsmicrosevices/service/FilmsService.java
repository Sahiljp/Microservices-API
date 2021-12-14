package com.api.filmsmicrosevices.service;

import java.util.List;
import java.util.Optional;

import com.api.filmsmicrosevices.Entity.Films;

public interface FilmsService {

	Films addFilms(Films films);

	Optional<Films> getFilms(Long id);

}
