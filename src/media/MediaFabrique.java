package media;/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import media.Livre;
import media.Video;

public class MediaFabrique{


	// methodes

	// pour créer l'objet media.Livre
	public static Livre creerLivre(String[] data){
		try {
			// tout les attributs
			int id = Integer.parseInt(data[0]);
			String titre = data[1];
			String auteur = data[2];
			int dateDePublication = Integer.parseInt(data[3]);
			Double prix = Double.parseDouble(data[4]);
			String type = data[5];
			String ISBN = data[6];
			String genre = data[7];
			String resume = data[8];

			return new Livre(id, titre, auteur, dateDePublication, prix, type, ISBN, genre, resume);
		}catch (Exception e){
			System.out.println("Erreur lors de la création du media.Livre : " + e.getMessage());
			return null;
		}
	}


	// pour créer l'objet video
	public static Video creerVideo(String[] data){
		try {
			int id = Integer.parseInt(data[0]);
			String titre = data[1];
			String auteur = data[2];
			int dateDePublication = Integer.parseInt(data[3]);
			Double prix = Double.parseDouble(data[4]);
			String type = data[5];
			String duree = data[6];
			String format = data[7];
			String resolution = data[8];
			String url = data[9];
			int nombreDeVues = Integer.parseInt(data[10]);
			String description = data[11];

			return new Video(id, titre, auteur, dateDePublication, prix, type, duree, format, resolution, url, nombreDeVues, description);
		}catch (Exception e) {
			System.out.println("Erreur lors de la création de la Vidéo : " + e.getMessage());
			return null;
		}
	}


	// si on aura d'autre media, on peux creer tant de methodes


}