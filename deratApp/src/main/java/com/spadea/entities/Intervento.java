package com.spadea.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Intervento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private LocalDate dataIntervento;
	@ManyToOne
	private Cantiere cantiere;
	
	public Cantiere getCantiere() {
		return cantiere;
	}
	public void setCantiere(Cantiere cantiere) {
		this.cantiere = cantiere;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDataIntervento() {
		return dataIntervento;
	}
	public void setDataIntervento(LocalDate dataIntervento) {
		this.dataIntervento = dataIntervento;
	}
}
