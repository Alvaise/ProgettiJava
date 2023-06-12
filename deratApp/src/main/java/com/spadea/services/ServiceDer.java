package com.spadea.services;

import java.util.List;
import java.util.Optional;

import com.spadea.entities.Cantiere;
import com.spadea.entities.Intervento;

public interface ServiceDer {

	List<Cantiere> getCantieri();
	List<Intervento> getInterventi();
	Optional<Intervento> getInterventiByCantiereId(int id);
	Intervento addIntervento(Intervento i);
	Cantiere addCantiere(Cantiere c);
}
