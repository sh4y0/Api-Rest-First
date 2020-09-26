package com.example.persona.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.persona.entities.Libro;
import com.example.persona.repositories.BaseRepository;
import com.example.persona.repositories.LibroRepository;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {

	@Autowired
	private LibroRepository libroRepository;
	
	public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
		super(baseRepository);
		
	}

}
