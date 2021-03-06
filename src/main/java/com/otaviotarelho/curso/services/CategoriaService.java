package com.otaviotarelho.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.otaviotarelho.curso.domain.Categoria;
import com.otaviotarelho.curso.repositories.CategoriaRepository;
import com.otaviotarelho.curso.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("object não encontrado");
		}
		
		return obj;
	}
	
}
