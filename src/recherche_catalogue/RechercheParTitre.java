package recherche_catalogue;

import media.Livre;
import media.Media;
import media.Video;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class RechercheParTitre implements RechercheStrategie{

    private String titre;

    // constructeur

    public RechercheParTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public PriorityQueue<Media> rechercherMedia(List<Media> medias) {
        // comparator
        Comparator<Media> comparator = Comparator.comparing(Media::getTitre);

        PriorityQueue<Media> queue = new PriorityQueue<>(comparator);
        queue.addAll(medias);
        return queue;  // retourne la liste de resultat.
    }

    @Override
    public PriorityQueue<Livre> rechercherLivre(List<Livre> livres) {
        return null;
    }

    @Override
    public PriorityQueue<Video> rechercherVideo(List<Video> videos) {
        return null;
    }

    // a faire


}
