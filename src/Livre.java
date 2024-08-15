/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.time.LocalDate;

class Livre extends Media{
	
	int ISBN;
	String genre;
	String resume;
	
	
	// Constructeur (avec attributs Parent)

	public Livre(int id, String titre, String auteur, LocalDate dateDePublication, Double prix, int ISBN, String genre, String resume) {
		super(id, titre, auteur, dateDePublication, prix);
		this.ISBN = ISBN;
		this.genre = genre;
		this.resume = resume;
	}


	//Methodes
	
	
	
	
	// Getter et Setter
	
	
	
	
	// ToString


	@Override
	public String toString() {
		return "Livre{" +
				"ISBN=" + ISBN +
				", genre='" + genre + '\'' +
				", resume='" + resume + '\'' +
				", id=" + id +
				", titre='" + titre + '\'' +
				", auteur='" + auteur + '\'' +
				", dateDePublication=" + dateDePublication +
				", prix=" + prix +
				'}';
	}
}