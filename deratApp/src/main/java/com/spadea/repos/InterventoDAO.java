package com.spadea.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spadea.entities.Intervento;

public interface InterventoDAO extends JpaRepository<Intervento, Integer> {

	
}
