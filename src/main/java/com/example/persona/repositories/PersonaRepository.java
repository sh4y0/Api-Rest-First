package com.example.persona.repositories;

import org.springframework.stereotype.Repository;

import com.example.persona.entities.Persona;

@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
	

}
