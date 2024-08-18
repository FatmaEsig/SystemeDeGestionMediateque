/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.time.LocalDate;
import java.util.List;
import java.util.PriorityQueue;

class Emprunt{

	int id;
	Media media;
	Adherent adherent;
	LocalDate dateEmprunt;
	LocalDate dateRetour;
	List<String> queueEmprunt; // FIFO

	// trier par date d'emprunt passé
	PriorityQueue<Emprunt> listeEmpruntsPassee;
	
	// constructeur

	public Emprunt(int id, Media media, Adherent adherent, LocalDate dateEmprunt, LocalDate dateRetour) {
		this.id = id;
		this.media = media;
		this.adherent = adherent;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
	}


	// methodes


	
	// getters et setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public Adherent getAdherent() {
		return adherent;
	}

	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}

	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public LocalDate getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(LocalDate dateRetour) {
		this.dateRetour = dateRetour;
	}

	public List<String> getQueueEmprunt() {
		return queueEmprunt;
	}

	public void setQueueEmprunt(List<String> queueEmprunt) {
		this.queueEmprunt = queueEmprunt;
	}

	public PriorityQueue<Emprunt> getListeEmpruntsPassee() {
		return listeEmpruntsPassee;
	}

	public void setListeEmpruntsPassee(PriorityQueue<Emprunt> listeEmpruntsPassee) {
		this.listeEmpruntsPassee = listeEmpruntsPassee;
	}


	// toString


	@Override
	public String toString() {
		return "Emprunt{" +
				"id=" + id +
				", media=" + media +
				", adherent=" + adherent +
				", dateEmprunt=" + dateEmprunt +
				", dateRetour=" + dateRetour +
				", queueEmprunt=" + queueEmprunt +
				", listeEmpruntsPassee=" + listeEmpruntsPassee +
				'}';
	}
}