/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/


import media.Livre;
import media.Media;
import media.Video;
import recherche_catalogue.RechercheStrategie;
import recherche_multicritere_catalogue.RechercheMulticritere;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Catalogue{

	ArrayList<Media> listeMedia;		// pas utile
	private List<Livre> listeLivre;
	private List<Video> listeVideo;

	private RechercheStrategie strategie; // trie unique

	private RechercheMulticritere strategieMulti; // trie multi

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

	/*
	public void ajouterMedia(Media media){
		listeMedia.add(media);
	}*/
	public void ajouterLivre(Livre livre){
		listeLivre.add(livre);
	}

	public void ajouterVideo(Video video){
		listeVideo.add(video);
	}



	// getters et setters


	public void setStrategie(RechercheStrategie strategie) {
		this.strategie = strategie;
	}

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

	public void setStrategieMulti(RechercheMulticritere strategieMulti) {
		this.strategieMulti = strategieMulti;
	}
// Pour trier avec Strategie

	/*// pour media (tout)
	public PriorityQueue<Media> rechercheMedia(RechercheStrategie trie){
		return trie.rechercherMedia(listeMedia);
	}*/

	// pour livres
	public PriorityQueue<Livre> rechercheLivre(String critere){
		if (strategie == null){
			throw new IllegalStateException("Aucune trie est definie.");
		}
		return strategie.rechercherLivre(listeLivre, critere);
	}

	// pour videos
	public PriorityQueue<Video> rechercheVideo(String critere){
		return strategie.rechercherVideo(listeVideo, critere);
	}

	// ------------------------------------------------
	// Recherche multicritere (3 methodes avec arguments variés)

	public PriorityQueue<Livre> rechercherMulti(String titre){
		if (strategieMulti == null){
			throw new IllegalStateException("Aucun trie choisi.");
		}
		return strategieMulti.rechercher(listeLivre, titre);
	}

	public PriorityQueue<Livre> rechercheMulti(String titre, int annee){
		if (strategieMulti == null){
			throw new IllegalStateException("Aucun trie choisi.");
		}
		return strategieMulti.rechercher(listeLivre, titre, annee);
	}

	public PriorityQueue<Livre> rechercherMulti(String titre, int annee, String auteur){
		if (strategieMulti == null){
			throw new IllegalStateException("Aucun trie choisi.");
		}
		return strategieMulti.rechercher(listeLivre, titre, annee, auteur);
	}
}