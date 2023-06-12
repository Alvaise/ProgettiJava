package com.spadea.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class TabellaInterventi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int numeroPostazione;
	private Boolean escaMangiata;
	private Boolean trappolaCambiata;
	private int numeroEscheCambiate;
	@ManyToOne
	private Intervento intervento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumeroPostazione() {
		return numeroPostazione;
	}
	public void setNumeroPostazione(int numeroPostazione) {
		this.numeroPostazione = numeroPostazione;
	}
	public Boolean getEscaMangiata() {
		return escaMangiata;
	}
	public void setEscaMangiata(Boolean escaMangiata) {
		this.escaMangiata = escaMangiata;
	}
	public Boolean getTrappolaCambiata() {
		return trappolaCambiata;
	}
	public void setTrappolaCambiata(Boolean trappolaCambiata) {
		this.trappolaCambiata = trappolaCambiata;
	}
	public int getNumeroEscheCambiate() {
		return numeroEscheCambiate;
	}
	public void setNumeroEscheCambiate(int numeroEscheCambiate) {
		this.numeroEscheCambiate = numeroEscheCambiate;
	}
	public Intervento getIntervento() {
		return intervento;
	}
	public void setIntervento(Intervento intervento) {
		this.intervento = intervento;
	}
	
}
