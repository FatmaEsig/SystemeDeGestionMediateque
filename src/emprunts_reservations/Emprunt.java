package emprunts_reservations;/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import media.Catalogue;
import media.Livre;
import media.Media;
import media.Video;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Emprunt {
	private int id;
	private Media media;
	private Adherent adherent;
	//private Reservation reservation;
	private LocalDate dateEmprunt;
	private LocalDate dateRetour;
	private static List<Emprunt> listeEmpruntsEnCours = new ArrayList<>(); // pour stocker les emprunts actuels

	// Compare to pour trier par date de retour (pour les emprunts passés)
	private static PriorityQueue<Emprunt> listeEmpruntsPassee = new PriorityQueue<>((e1, e2) -> e1.getDateRetour().compareTo(e2.getDateRetour()));

	//private static List<Emprunt> listeEmpruntsPassee = new ArrayList<>(); // pour stocker les emprunts passés
	// constructeur
	public Emprunt(int id, Media media, Adherent adherent, LocalDate dateEmprunt, LocalDate dateRetour) {
		this.id = id;
		this.media = media;
		this.adherent = adherent;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
		//this.reservation = new Reservation(id, media, adherent);
	}

	// methodes

	// Methode pour ajouter un emprunt à la liste des emprunts dont la date de retour est passé
	public static void ajouterEmpruntEnRetard(Emprunt emprunt) {
		if (emprunt.estEnRetard()) {
			listeEmpruntsPassee.add(emprunt);
		}
	}

	// Méthode pour afficher les emprunts en cours
	public static void listerEmpruntsEnCours() {
		System.out.println("Les emprunts en cours: ");
		for (Emprunt emprunt : listeEmpruntsEnCours) {
			System.out.println(emprunt.getMedia().getTitre() + " emprunté par " + emprunt.getAdherent().getNom() +
					" jusqu'à " + emprunt.getDateRetour());
		}
	}

	// Methode pour lister les emprunts dont la date de retour est passée (en retards)
	public static void listerEmpruntsEnRetards() {
		System.out.println("Les emprunts dont la date de retour est passés :");
		if (listeEmpruntsPassee.isEmpty()) {
			System.out.println("Aucun emprunt en retard.");
		} else {
			for (Emprunt emprunt : listeEmpruntsPassee) {
				System.out.println(emprunt.getMedia().getTitre() + " emprunté par " + emprunt.getAdherent().getNom() +
						" du " + emprunt.getDateEmprunt() + " au " + emprunt.getDateRetour());
			}
		}

		/*while (!listeEmpruntsPassee.isEmpty()) {
			Emprunt emprunt = listeEmpruntsPassee.poll();
		//for (Emprunt emprunt : listeEmpruntsPassee) {
			System.out.println(emprunt.getMedia().getTitre() + " emprunté par " + emprunt.getAdherent().getNom() +
					" du " + emprunt.getDateEmprunt() + " au " + emprunt.getDateRetour());
		}*/
	}

	// Méthode pour rechercher un emprunt par média, si le media existe dans la liste des emprunts en cours, il retourne cet objet emprunt
	public static Emprunt rechercherEmpruntParMedia(Media media) {
		for (Emprunt emprunt : listeEmpruntsEnCours) {
			if (emprunt.getMedia().equals(media)) {
				return emprunt;
			}
		}
		return null;
	}

	// methode pour la logique de emprunter un media en vue de sa disponibilité et l'autorisation
	public static void emprunterMedia(Media media, Adherent adherent) {
		if (!adherent.estAdherent()) {
			System.out.println("Seuls les adherents peuvent emprunter des médias");
			return;
		}
		if (media.isDisponible()) {

			// Si le media est disponible, on crée un nouveau emprunt en ajoutant l'adherant et le media avec la date du jour et de retour
			Emprunt emprunt = new Emprunt(listeEmpruntsEnCours.size() + 1, media, adherent, LocalDate.now(), LocalDate.now().plusWeeks(2));
			listeEmpruntsEnCours.add(emprunt);
			media.setDisponible(false);         // il n'est pas disponible en ce moment
			System.out.println(adherent.getPrenom() + " " + adherent.getNom() + " a emprunté le média " + media.getTitre() + ", La date de retour sera le : " + emprunt.getDateRetour());
		} else {
			// Si le média n'est pas disponible, on l'ajoute à la liste de réservation (liste d'attente)
			Reservation nouveauReservation = new Reservation(Reservation.getListReservation().size() + 1, media, adherent);
			Reservation.ajouterReservation(nouveauReservation);
			System.out.println("Le média " + media.getTitre() + " n'est pas disponible. " +
					adherent.getPrenom() + " " + adherent.getNom() + " a été ajouté à la liste d'attente.");
		}
	}


	// Methode pour retourner un média
	public static void retournerMedia(Media media) {
		Emprunt empruntRetourne = rechercherEmpruntParMedia(media);

		// 1. On cherche l'emprunt correspondant
		//Emprunt empruntRetourne = null;
		//for (Emprunt emprunt : listeEmpruntsEnCours) {
		if (empruntRetourne != null) {
			media.setDisponible(true);
			listeEmpruntsEnCours.remove(empruntRetourne);        // 1. On enlève de la liste des emprunts en cours

			if (empruntRetourne.estEnRetard()) {
				listeEmpruntsPassee.remove(empruntRetourne);        // 2. On enlève de la liste des emprunts dont la date de retour est dépassée.
			}

			/*if (emprunt.getMedia().equals(media)){ // si le media existe dans notre liste de media
				empruntRetourne = emprunt;  // on prend l'emprunt
				break;
			}*/

			// 2. Si l'emprunt est trouvé, alors on mettra à jour la disponibilité du média dans la classe Media,
			// on enlevera le media dans la liste des emprunts,
			//if (empruntRetourne != null){



			/*Reservation reservation = trouverReservation(media);
			if (reservation != null && !reservation.estVide()) {
				Adherent prochainAdherent = reservation.prochainAdherent();
				emprunterMedia(prochainAdherent, media);*/
			// 3. On vérifie s'il y a une réservation pour ce média
			for (Reservation reservation : Reservation.getListReservation()) {
				if (reservation.getMedia().equals(media) && !reservation.estVide()) {
					Reservation prochainReservation = reservation.prochainReservation();
					if (prochainReservation != null) {
						Emprunt nouvelEmprunt = new Emprunt(listeEmpruntsEnCours.size() + 1, media, prochainReservation.getAdherent(), LocalDate.now(), LocalDate.now().plusWeeks(2));
						//emprunterMedia(prochainReservation, media);  // Le premier reservation en attente emprunte le média
						listeEmpruntsEnCours.add(nouvelEmprunt);
						media.setDisponible(false);		// denouveau, le media n'est pas disponible
						System.out.println("Le média " + media.getTitre() + " a été emprunté par " + prochainReservation.getAdherent().getNom() + " qui était en liste d'attente.");
					}
					break;
				}
			}
			System.out.println("Le média " + media.getTitre() + " a été retourné par " + empruntRetourne.getAdherent().getNom());
		}
		else
		{
			System.out.println("Ce média n'a pas été emprunté.");
		}
	}



	// Méthode pour vérifier si l'emprunt est en retard
	public boolean estEnRetard(){
		LocalDate today = LocalDate.now();
		return today.isAfter(dateRetour);
	}

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

	public PriorityQueue<Emprunt> getListeEmpruntsPassee() {
		return listeEmpruntsPassee;
	}

	public void setListeEmpruntsPassee(PriorityQueue<Emprunt> listeEmpruntsPassee) {
		this.listeEmpruntsPassee = listeEmpruntsPassee;
	}

	public List<Emprunt> getListeEmpruntsEnCours() {
		return listeEmpruntsEnCours;
	}

	public void setListeEmpruntsEnCours(List<Emprunt> listeEmpruntsEnCours) {
		this.listeEmpruntsEnCours = listeEmpruntsEnCours;
	}


// toString
	@Override
	public String toString() {
		return "emprunts_reservations.Emprunt{" +
				"id=" + id +
				", media=" + media +
				", adherent=" + adherent +
				", dateEmprunt=" + dateEmprunt +
				", dateRetour=" + dateRetour +
				", listeEmpruntsPassee=" + listeEmpruntsPassee +
				'}';
	}
}