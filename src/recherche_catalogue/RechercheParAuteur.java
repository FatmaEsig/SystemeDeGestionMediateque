package recherche_catalogue;

import media.Livre;
import media.Media;
import media.Video;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class RechercheParAuteur implements RechercheStrategie{

    /*
    @Override
    public PriorityQueue<Media> rechercherMedia(List<Media> medias) {
        // comparator
        Comparator<Media> comparator = Comparator.comparing(Media::getAuteur);

        PriorityQueue<Media> queue = new PriorityQueue<>(comparator);
        queue.addAll(medias);
        return queue;  // retourne la liste de resultat.
    }*/

    @Override
    public PriorityQueue<Livre> rechercherLivre(List<Livre> livres, String critere) {
        // comparator
        //Comparator<Livre> comparator = Comparator.comparing(Livre::getAuteur);

        PriorityQueue<Livre> queue = new PriorityQueue<>();
        for (Livre livre : livres) {
            if(livre.getAuteur().equalsIgnoreCase(critere)){
                queue.add(livre);
            }
        }
        //queue.addAll(livres);
        return queue;  // retourne la liste de resultat.
    }

    @Override
    public PriorityQueue<Video> rechercherVideo(List<Video> videos, String critere) {
        // comparator
        //Comparator<Video> comparator = Comparator.comparing(Video::getAuteur);

        PriorityQueue<Video> queue = new PriorityQueue<>();
        for (Video video : videos) {
            if(video.getAuteur().equalsIgnoreCase(critere)){
                queue.add(video);
            }
        }
        //queue.addAll(videos);
        return queue;  // retourne la liste de resultat.
    }
}
