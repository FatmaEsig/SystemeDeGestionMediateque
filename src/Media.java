/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.time.LocalDate;

class Media{
	int id;
	String titre;
	String auteur;
	LocalDate dateDePublication;
	Double prix;
	
	//Constructeur

	public Media(int id, String titre, String auteur, LocalDate dateDePublication, Double prix) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.dateDePublication = dateDePublication;
		this.prix = prix;
	}


	//Methodes
	
	
	
	
	// Getter et Setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public LocalDate getDateDePublication() {
		return dateDePublication;
	}

	public void setDateDePublication(LocalDate dateDePublication) {
		this.dateDePublication = dateDePublication;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}


	// ToString


	@Override
	public String toString() {
		return "Media{" +
				"id=" + id +
				", titre='" + titre + '\'' +
				", auteur='" + auteur + '\'' +
				", dateDePublication=" + dateDePublication +
				", prix=" + prix +
				'}';
	}
}