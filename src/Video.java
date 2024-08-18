/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.time.LocalDate;

class Video extends Media{
	
	String duree;
	String format;
	String resolution;
	String url;
	int nombreDeVues;
	String description;
	//etc
	
	
	// constructeur avec héritage des attribut parent

	public Video(int id, String titre, String auteur, int dateDePublication, Double prix, String type, String duree, String format, String resolution, String url, int nombreDeVues, String description) {
		super(id, titre, auteur, dateDePublication, prix, type);
		this.duree = duree;
		this.format = format;
		this.resolution = resolution;
		this.url = url;
		this.nombreDeVues = nombreDeVues;
		this.description = description;
	}


	// methodes
	
	// getters et setters

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNombreDeVues() {
		return nombreDeVues;
	}

	public void setNombreDeVues(int nombreDeVues) {
		this.nombreDeVues = nombreDeVues;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


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