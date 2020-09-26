package com.example.persona.services;

import java.io.Serializable;
import java.util.List;

import com.example.persona.entities.Base;


public interface BaseService <E extends Base, ID extends Serializable>    {
	
	public List<E> findAll() throws Exception;
	public E findById(ID id) throws Exception;
	public E save(E entity) throws Exception;
	public E update(ID id, E entity) throws Exception;
	public boolean delete (ID id) throws Exception;

}
