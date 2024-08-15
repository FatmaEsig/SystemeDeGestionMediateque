/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.time.LocalDate;

class Video extends Media{
	
	double duree;
	int format;
	int resolution;
	String url;
	int nombreDeVues;
	String description;
	//etc
	
	
	// constructeur avec héritage des attribut parent

	public Video(int id, String titre, String auteur, LocalDate dateDePublication, Double prix, double duree, int format, int resolution, String url, int nombreDeVues, String description) {
		super(id, titre, auteur, dateDePublication, prix);
		this.duree = duree;
		this.format = format;
		this.resolution = resolution;
		this.url = url;
		this.nombreDeVues = nombreDeVues;
		this.description = description;
	}


	// methodes
	
	// getters et setters
	
	// toString

	@Override
	public String toString() {
		return "Video{" +
				"duree=" + duree +
				", format=" + format +
				", resolution=" + resolution +
				", url='" + url + '\'' +
				", nombreDeVues=" + nombreDeVues +
				", description='" + description + '\'' +
				", id=" + id +
				", titre='" + titre + '\'' +
				", auteur='" + auteur + '\'' +
				", dateDePublication=" + dateDePublication +
				", prix=" + prix +
				'}';
	}
}