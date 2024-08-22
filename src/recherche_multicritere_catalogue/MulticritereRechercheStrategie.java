package recherche_multicritere_catalogue;

import media.Livre;
import media.Media;

import java.util.List;
import java.util.PriorityQueue;

public interface MulticritereRechercheStrategie {
    PriorityQueue<Livre> rechercher(List<Livre> livres, String titre);
    PriorityQueue<Livre> rechercher(List<Livre> livres, String titre, int annee);
    PriorityQueue<Livre> rechercher(List<Livre> livres, String titre, int annee, String auteur);

    // pour media
    /*
    PriorityQueue<Media> rechercherMedia(List<Media> medias, String titre);
    PriorityQueue<Media> rechercherMedia(List<Media> medias, String titre, int annee);
    PriorityQueue<Media> rechercherMedia(List<Media> medias, String titre, int annee, String auteur);
    */

}
