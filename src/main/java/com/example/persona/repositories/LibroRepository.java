package com.example.persona.repositories;

import org.springframework.stereotype.Repository;

import com.example.persona.entities.Libro;

@Repository
public interface LibroRepository extends BaseRepository<Libro, Long> {

}
