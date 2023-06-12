package com.spadea.integration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spadea.entities.Cantiere;
import com.spadea.entities.Intervento;
import com.spadea.entities.TabellaInterventi;
import com.spadea.services.ServiceDerImpl;

@RestController
public class ControllerRest {

	@Autowired
	private ServiceDerImpl service;
	
	@GetMapping("api/cantieri/all")
	public List<Cantiere> getCantieri(){
		return service.getCantieri();
	}
	
	@GetMapping("api/interventi/all")
	public List<Intervento> getInterventi(){
		return service.getInterventi();
	}
	
	@PostMapping("api/cantieri/add-cantiere")
	public Cantiere addCantiere(@RequestBody Cantiere c) {
		return service.addCantiere(c);
	}
	
	@PostMapping("api/interventi/add-intervento")
	public Intervento addIntervento(@RequestBody Intervento i) {
		return service.addIntervento(i);
	}
	@GetMapping("api/tabinterventi")
	public List<TabellaInterventi> getTabAll(){
		return service.getTabella();
	}
}
