package recherche_catalogue;

import media.Livre;
import media.Media;
import media.Video;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class RechercheParAnnee implements RechercheStrategie{

    @Override
    public PriorityQueue<Media> rechercherMedia(List<Media> medias) {
        // comparator
        Comparator<Media> comparator = Comparator.comparing(Media::getDateDePublication);

        PriorityQueue<Media> queue = new PriorityQueue<>(comparator);
        queue.addAll(medias);
        return queue;  // retourne la liste de resultat.
    }

    @Override
    public PriorityQueue<Livre> rechercherLivre(List<Livre> livres) {
        // comparator
        Comparator<Livre> comparator = Comparator.comparing(Livre::getDateDePublication);

        PriorityQueue<Livre> queue = new PriorityQueue<>(comparator);
        queue.addAll(livres);
        return queue;  // retourne la liste de resultat.
    }

    @Override
    public PriorityQueue<Video> rechercherVideo(List<Video> videos) {
        // comparator
        Comparator<Video> comparator = Comparator.comparing(Video::getDateDePublication);

        PriorityQueue<Video> queue = new PriorityQueue<>(comparator);
        queue.addAll(videos);
        return queue;  // retourne la liste de resultat.
    }
}
