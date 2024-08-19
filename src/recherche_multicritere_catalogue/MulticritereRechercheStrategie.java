package recherche_multicritere_catalogue;

import media.Livre;

import java.util.List;
import java.util.PriorityQueue;

public interface MulticritereRechercheStrategie {
    PriorityQueue<Livre> rechercher(List<Livre> livres, String titre);
    PriorityQueue<Livre> rechercher(List<Livre> livres, String titre, int annee);
    PriorityQueue<Livre> rechercher(List<Livre> livres, String titre, int annee, String auteur);

}
