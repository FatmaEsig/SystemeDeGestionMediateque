package emprunts_reservations;/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import media.Media;

import java.util.LinkedList;
import java.util.Queue;

public class Reservation{
	private int id;
	private Media media;
	private Adherent adherent;
	private static Queue<Reservation> listReservation = new LinkedList<>(); // FIFO, queue
	
	// Constructeur

	public Reservation(int id, Media media, Adherent adherent) {
		this.id = id;
		this.media = media;
		this.adherent = adherent;
	}


	// Methodes
	// Methode pour ajouter les adherants à la liste d'attente
	public static void ajouterReservation(Reservation reservation){
		listReservation.add(reservation);
		System.out.println("Adhérent " + reservation.adherent.getNom() + " ajouté à la liste d'attente pour le média " + reservation.media.getTitre());
	}

	// Methode pour afficher la liste des reservations
	public void afficherReservations(){
		for (Reservation reservation : listReservation) {
			System.out.println("Liste d'attente pour le média " + reservation.media.getTitre() + ":");
			System.out.println("- " + reservation.getAdherent().getPrenom() + " " + reservation.getAdherent().getNom());
		}
	}

	// methode pour vérifier si la liste d'attente est vide ou pas
	public boolean estVide(){
		return listReservation.isEmpty();
	}

	// Méthode pour recuperer le prochain adhérent dans la file d'attente
	public Reservation prochainReservation() {
		return listReservation.poll(); // Retourne et retire le prochain reservation de la file d'attente
	}

	// Getters et Setters
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

	public static Queue<Reservation> getListReservation() {
		return listReservation;
	}

	public void setListReservation(Queue<Reservation> listReservation) {
		this.listReservation = listReservation;
	}

	public Adherent getAdherent() {
		return adherent;
	}

	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}
// ToString

	@Override
	public String toString() {
		return "emprunts_reservations.Reservation{" +
				"id='" + id + '\'' +
				", media=" + media +
				'}';
	}
}