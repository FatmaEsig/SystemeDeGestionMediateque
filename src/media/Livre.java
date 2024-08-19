package media;/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

public class Livre extends Media implements Comparable<Livre>{
	
	String ISBN;
	String genre;
	String resume;
	
	// Constructeur (avec attributs Parent)

	public Livre(int id, String titre, String auteur, int dateDePublication, Double prix, String type, String ISBN, String genre, String resume) {
		super(id, titre, auteur, dateDePublication, prix, type);
		this.ISBN = ISBN;
		this.genre = genre;
		this.resume = resume;
	}

	//Methodes

	// Getter et Setter

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
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
		return "media.Livre{" +
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

	@Override
	public int compareTo(Livre autreLivre) {
		int titreComparaison = this.getTitre().compareToIgnoreCase(autreLivre.getTitre());
		if (titreComparaison != 0) {
			return titreComparaison;
		}
		int dateComparaison = Integer.compare(this.getDateDePublication(), autreLivre.getDateDePublication());
		if (dateComparaison != 0) {
			return dateComparaison;
		}
		return this.getAuteur().compareToIgnoreCase(autreLivre.getAuteur());
	}

}