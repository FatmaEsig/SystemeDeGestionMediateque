package media;/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.time.LocalDate;

public class Media{
	int id;
	String titre;
	String auteur;
	int dateDePublication;
	Double prix;
	String type;  // pour differencier si c'est une video ou un livre
	
	//Constructeur

	public Media(int id, String titre, String auteur, int dateDePublication, Double prix, String type) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.dateDePublication = dateDePublication;
		this.prix = prix;
		this.type = type;
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

	public int getDateDePublication() {
		return dateDePublication;
	}

	public void setDateDePublication(int dateDePublication) {
		this.dateDePublication = dateDePublication;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
// ToString


	@Override
	public String toString() {
		return "media.Media{" +
				"id=" + id +
				", titre='" + titre + '\'' +
				", auteur='" + auteur + '\'' +
				", dateDePublication=" + dateDePublication +
				", prix=" + prix +
				",type=" + type +
				'}';
	}
}