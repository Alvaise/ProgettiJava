package com.spadea.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spadea.entities.Cantiere;
import com.spadea.entities.Intervento;
import com.spadea.entities.TabellaInterventi;
import com.spadea.repos.CantiereDAO;
import com.spadea.repos.InterventoDAO;
import com.spadea.repos.TabellaInterventiDAO;

@Service
public class ServiceDerImpl implements ServiceDer {

	@Autowired
	private CantiereDAO cantiereDao;
	@Autowired
	private InterventoDAO interventoDao;
	@Autowired
	private TabellaInterventiDAO tabDao;
	
	@Override
	public List<Cantiere> getCantieri() {
		return cantiereDao.findAll();
	}

	@Override
	public List<Intervento> getInterventi() {
		return interventoDao.findAll();
	}

	@Override
	public Intervento addIntervento(Intervento i) {
		return interventoDao.save(i);
	}

	@Override
	public Cantiere addCantiere(Cantiere c) {
		return cantiereDao.save(c);
	}

	@Override
	public List<TabellaInterventi> getTabella() {
		// TODO Auto-generated method stub
		return tabDao.findAll();
	}


}
