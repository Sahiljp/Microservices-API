package com.api.filmsmicrosevices.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.filmsmicrosevices.FilmsRepository;
import com.api.filmsmicrosevices.Entity.Films;
import com.api.filmsmicrosevices.service.FilmsService;

@Service
public class FilmsServiceImpl implements FilmsService {

	@Autowired
	public FilmsRepository filmsRepository;

	@Autowired
	public SequenceGeneratorService seqGenerator;

	@Override
	public Films addFilms(Films films) {

		films.setId(seqGenerator.generateSequence(Films.SEQUENCE_NAME));

		Films result = filmsRepository.save(films);
		return result;
	}

	@Override
	public Optional<Films> getFilms(Long id) {
		return filmsRepository.findById(id);

	}

}
