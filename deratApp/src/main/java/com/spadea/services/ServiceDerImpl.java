package com.spadea.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spadea.entities.Cantiere;
import com.spadea.entities.Intervento;
import com.spadea.repos.CantiereDAO;
import com.spadea.repos.InterventoDAO;

@Service
public class ServiceDerImpl implements ServiceDer {

	@Autowired
	private CantiereDAO cantiereDao;
	@Autowired
	private InterventoDAO interventoDao;
	
	@Override
	public List<Cantiere> getCantieri() {
		return cantiereDao.findAll();
	}

	@Override
	public List<Intervento> getInterventi() {
		return interventoDao.findAll();
	}

	@Override
	public Optional<Intervento> getInterventiByCantiereId(int id) {
		// TODO Auto-generated method stub
		return interventoDao.findById(id);
	}


	@Override
	public Intervento addIntervento(Intervento i) {
		// TODO Auto-generated method stub
		return interventoDao.save(i);
	}

	@Override
	public Cantiere addCantiere(Cantiere c) {
		return cantiereDao.save(c);
	}

}
