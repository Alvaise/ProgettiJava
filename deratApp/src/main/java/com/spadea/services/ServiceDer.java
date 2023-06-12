package com.spadea.services;

import java.util.List;
import java.util.Optional;

import com.spadea.entities.Cantiere;
import com.spadea.entities.Intervento;
import com.spadea.entities.TabellaInterventi;

public interface ServiceDer {

	List<Cantiere> getCantieri();
	List<Intervento> getInterventi();
	Intervento addIntervento(Intervento i);
	Cantiere addCantiere(Cantiere c);
	List<TabellaInterventi> getTabella();
}
