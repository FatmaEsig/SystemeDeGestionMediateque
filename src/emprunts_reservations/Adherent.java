package emprunts_reservations;/*
Auteur : Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.time.LocalDate;
import java.util.HashMap;

public class Adherent{
	private int id;
	private String prenom;
	private String nom;
	private String adresse;
	private long numTel;
	private LocalDate dateDeNaiss;
	private static HashMap<Integer,Adherent> listeAdherents = new HashMap<>();
	
	// constructeur
	public Adherent(int id, String prenom, String nom, String adresse, long numTel, LocalDate dateDeNaiss) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.numTel = numTel;
		this.dateDeNaiss = dateDeNaiss;
	}


	// methodes

	/*
		Methode qui ajoute un adhérent à la HashMap
	*/
	public static void ajouterAdherent(Adherent adherent){
		if (listeAdherents.containsKey(adherent.id)){
			System.out.println("Adhérent avec ID " + adherent.id + " existe déjà.");
		}
		else {
			listeAdherents.put(adherent.id, adherent);
			System.out.println("Adhérent ajouté avec succès.");
		}
	}

	// Méthode pour modifier un adhérent
	public static void modifierAdherent(int id, String prenom, String nom, String adresse, long numTel, LocalDate dateDeNaiss) {
		Adherent adherent = listeAdherents.get(id);
		if (adherent != null) {
			adherent.prenom = prenom;
			adherent.nom = nom;
			adherent.adresse = adresse;
			adherent.numTel = numTel;
			adherent.dateDeNaiss = dateDeNaiss;
			System.out.println("Adhérent modifié avec succès.");
		}
		else {
			System.out.println("Adhérent avec ID " + id + " n'existe pas.");
		}
	}
	// Méthode pour supprimer un adhérent
	public static void supprimerAdherent(int id) {
		if (listeAdherents.remove(id) != null) {
			// todo : si l'adherent a le media emprunté, il faut laisser supprimer l'adherent apres avoir retourné le media.
			System.out.println("Adhérent supprimé avec succès.");
		}
		else {
			System.out.println("Adhérent avec ID " + id + " n'existe pas.");
		}
	}

	// Methode qui verifie si la personne est emprunts_reservations.Adherent ou pas
	public boolean estAdherent(){
		return listeAdherents.containsKey(this.id);  // si son id n'existe pas dans notre systeme alors il n'est pas adherent.
	}


	/*
		Methode qui affiche les adhérents
	 */
	public static void afficherAdherents(){
		for (Integer id : listeAdherents.keySet()) {
			Adherent adherent = listeAdherents.get(id);
			System.out.println("ID: " + id + ", Prenom: " + adherent.prenom + ", Nom: " + adherent.nom);
		}
	}

	// Methode pour retourner l'objet adherent en passant le nom adherent au parametre
	public static Adherent rechercherAdherentParNom(String nom) {
		for (Adherent adherent : listeAdherents.values()) {
			if (adherent.getNom().equalsIgnoreCase(nom)) {
				return adherent;
			}
		}
		return null;
	}

	// getters et setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public long getNumTel() {
		return numTel;
	}

	public void setNumTel(long numTel) {
		this.numTel = numTel;
	}

	public LocalDate getDateDeNaiss() {
		return dateDeNaiss;
	}

	public void setDateDeNaiss(LocalDate dateDeNaiss) {
		this.dateDeNaiss = dateDeNaiss;
	}

	public HashMap<Integer, Adherent> getListeAdherents() {
		return listeAdherents;
	}

	public void setListeAdherents(HashMap<Integer, Adherent> listeAdherents) {
		this.listeAdherents = listeAdherents;
	}


	// toString
	@Override
	public String toString() {
		return "emprunts_reservations.Adherent{" +
				"id=" + id +
				", prenom='" + prenom + '\'' +
				", nom='" + nom + '\'' +
				", adresse='" + adresse + '\'' +
				", numTel=" + numTel +
				", dateDeNaiss=" + dateDeNaiss +
				", listeAdherents=" + listeAdherents +
				'}';
	}
}