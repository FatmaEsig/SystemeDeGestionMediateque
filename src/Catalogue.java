/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/


import media.Media;
import recherche_catalogue.RechercheStrategie;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Catalogue{

	ArrayList<Media> listeMedia;
	//PriorityQueue<Media> trierMedia;

	//HashMap<String,media.Media> media;  // soit ID, soit titre
	// arbre pour filtrer le media? 
	
	
	// constructeur
	public Catalogue() {
		this.listeMedia = new ArrayList<>();
	}

	// methodes

	public void ajouterMedia(Media media){
		listeMedia.add(media);
	}


	// getters et setters

	public ArrayList<Media> getListeMedia() {
		return listeMedia;
	}

	// Pour trier avec Strategie

	// pour media (tout)
	public PriorityQueue<Media> rechercheMedia(RechercheStrategie trie){
		return trie.rechercherMedia(listeMedia);
	}

	// pour livres

	// pour videos
	
	
}