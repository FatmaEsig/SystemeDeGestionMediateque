package media;/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

public class Video extends Media implements Comparable<Video>{
	
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
		return "media.Video{" +
				"duree=" + duree +
				", format=" + format +
				", resolution=" + resolution +
				", url='" + url + '\'' +
				", nombreDeVues=" + nombreDeVues +
				", description='" + description + '\'' +
				", id=" + getId() +
				", titre='" + getTitre() + '\'' +
				", auteur='" + getAuteur() + '\'' +
				", dateDePublication=" + getDateDePublication() +
				", prix=" + getPrix() +
				'}';
	}

	@Override
	public int compareTo(Video autreVideo) {
		//return this.getTitre().compareTo(autreVideo.getTitre());
		int titreComparaison = this.getTitre().compareToIgnoreCase(autreVideo.getTitre());
		if (titreComparaison != 0) {
			return titreComparaison;
		}
		int dateComparaison = Integer.compare(this.getDateDePublication(), autreVideo.getDateDePublication());
		if (dateComparaison != 0) {
			return dateComparaison;
		}
		return this.getAuteur().compareToIgnoreCase(autreVideo.getAuteur());
	}
}