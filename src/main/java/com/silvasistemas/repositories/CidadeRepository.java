package com.silvasistemas.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.silvasistemas.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Serializable>{

}
