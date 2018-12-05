package dev.top.entities;

import dev.top.entities.ActionAvis.Action;


public class Vote {
	

	//private Integer id;

	 public Collegue personne;
	

	 public Action avisPerso;
	 
	 public Vote() {
		 
	 }
	 
	public Vote(Collegue personne, Action avisPerso) {
		super();
		this.personne = personne;
		this.avisPerso = avisPerso;
	}


	public Collegue getPersonne() {
		return personne;
	}


	public void setPersonne(Collegue personne) {
		this.personne = personne;
	}


	public Action getAvisPerso() {
		return avisPerso;
	}


	public void setAvisPerso(Action avisPerso) {
		this.avisPerso = avisPerso;
	}
	
	
	 
	 

}
