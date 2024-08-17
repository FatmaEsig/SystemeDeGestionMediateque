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

	public Livre(int id, String titre, String auteur, LocalDate dateDePublication, Double prix, String type, int ISBN, String genre, String resume) {
		super(id, titre, auteur, dateDePublication, prix, type);
		this.ISBN = ISBN;
		this.genre = genre;
		this.resume = resume;
	}


	//Methodes
	
	
	
	
	// Getter et Setter

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}


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