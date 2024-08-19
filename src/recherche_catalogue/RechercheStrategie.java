package recherche_catalogue;

import media.Livre;
import media.Media;
import media.Video;

import java.util.List;
import java.util.PriorityQueue;


public interface RechercheStrategie {

    //PriorityQueue<Media> rechercherMedia (List<Media> medias); // pour tout les medias

    PriorityQueue<Livre> rechercherLivre (List<Livre> livres, String critere); // pour tous les livres

    PriorityQueue<Video> rechercherVideo (List<Video> videos, String critere); // pour tout les videos

}
