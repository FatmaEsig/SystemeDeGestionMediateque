/*
Auteur : Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.time.LocalDate;
import java.util.HashMap;

class Adherent{
	int id;
	String prenom;
	String nom;
	String adresse;
	int numTel;
	LocalDate dateDeNaiss;
	HashMap<String,Adherent> listeAdherents;
	
	// constructeur

	public Adherent(String prenom, String nom, String adresse, int numTel, LocalDate dateDeNaiss) {
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.numTel = numTel;
		this.dateDeNaiss = dateDeNaiss;
	}


	// methodes
	
	
	// getters et setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public LocalDate getDateDeNaiss() {
		return dateDeNaiss;
	}

	public void setDateDeNaiss(LocalDate dateDeNaiss) {
		this.dateDeNaiss = dateDeNaiss;
	}

	public HashMap<String, Adherent> getListeAdherents() {
		return listeAdherents;
	}

	public void setListeAdherents(HashMap<String, Adherent> listeAdherents) {
		this.listeAdherents = listeAdherents;
	}


	// toString
	@Override
	public String toString() {
		return "Adherent{" +
				"id=" + id +
				", prenom='" + prenom + '\'' +
				", nom='" + nom + '\'' +
				", adresse='" + adresse + '\'' +
				", numTel=" + numTel +
				", dateDeNaiss=" + dateDeNaiss +
				", listeAdherents=" + listeAdherents +
				'}';
	}
}