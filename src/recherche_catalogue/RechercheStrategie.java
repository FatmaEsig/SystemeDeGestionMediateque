package recherche_catalogue;

import media.Livre;
import media.Media;
import media.Video;

import java.util.List;


public interface RechercheStrategie {

    List<Media> rechercherMedia (List<Media> medias); // pour tout les medias

    List<Livre> rechercherLivre (List<Livre> livres); // pour tous les livres

    List<Video> rechercherVideo (List<Video> videos); // pour tout les videos

}
