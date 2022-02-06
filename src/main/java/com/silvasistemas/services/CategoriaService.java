package com.silvasistemas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silvasistemas.domain.Categoria;
import com.silvasistemas.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public Optional<Categoria> buscar(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj;	
		
	}

}
