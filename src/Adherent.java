/*
Auteur : Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.time.LocalDate;
import java.util.HashMap;

class Adherent{
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
		listeAdherents.put(adherent.id, adherent);
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
		return "Adherent{" +
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