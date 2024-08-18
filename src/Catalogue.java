/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/


import media.Livre;
import media.Media;
import media.Video;
import recherche_catalogue.RechercheStrategie;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Catalogue{

	ArrayList<Media> listeMedia;		// pas utile
	private List<Livre> listeLivre;
	private List<Video> listeVideo;

	//PriorityQueue<Media> trierMedia;
	//HashMap<String,media.Media> media;  // soit ID, soit titre
	// arbre pour filtrer le media? 
	
	
	// constructeur
	public Catalogue() {
		this.listeMedia = new ArrayList<>(); // pas utile
		this.listeLivre = new ArrayList<>();
		this.listeVideo = new ArrayList<>();
	}

	// methodes

	public void ajouterMedia(Media media){
		listeMedia.add(media);
	}
	public void ajouterLivre(Livre livre){
		listeLivre.add(livre);
	}

	public void ajouterVideo(Video video){
		listeVideo.add(video);
	}



	// getters et setters


	public List<Livre> getListeLivre() {
		return listeLivre;
	}

	public void setListeLivre(List<Livre> listeLivre) {
		this.listeLivre = listeLivre;
	}

	public List<Video> getListeVideo() {
		return listeVideo;
	}

	public void setListeVideo(List<Video> listeVideo) {
		this.listeVideo = listeVideo;
	}


	// Pour trier avec Strategie

	// pour media (tout)
	public PriorityQueue<Media> rechercheMedia(RechercheStrategie trie){
		return trie.rechercherMedia(listeMedia);
	}

	// pour livres
	public PriorityQueue<Livre> rechercheLivre(RechercheStrategie trie){
		return trie.rechercherLivre(listeLivre);
	}

	// pour videos
	public PriorityQueue<Video> rechercheVideo(RechercheStrategie trie){
		return trie.rechercherVideo(listeVideo);
	}
	
}