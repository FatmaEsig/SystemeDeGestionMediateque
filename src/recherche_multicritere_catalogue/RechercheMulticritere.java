package recherche_multicritere_catalogue;

import media.Livre;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class RechercheMulticritere implements MulticritereRechercheStrategie{

    @Override
    public PriorityQueue<Livre> rechercher(List<Livre> livres, String titre) {
        return rechercher(livres, titre, 0, null);
    }

    @Override
    public PriorityQueue<Livre> rechercher(List<Livre> livres, String titre, int annee) {
        return rechercher(livres, titre, annee, null);
    }

    @Override
    public PriorityQueue<Livre> rechercher(List<Livre> livres, String titre, int annee, String auteur) {
        PriorityQueue<Livre> queue = new PriorityQueue<>();
        for (Livre livre : livres) {
            boolean correspond = true;
            if (titre != null && !titre.isEmpty() && !livre.getTitre().equalsIgnoreCase(titre)){
                correspond = false;
            }
            if (annee != 0 && !String.valueOf(livre.getDateDePublication()).equals(String.valueOf(annee))) {
                correspond = false;
            }
            if (auteur != null && !auteur.isEmpty() && !livre.getAuteur().equalsIgnoreCase(auteur)) {
                correspond = false;
            }
            if (correspond) {
                queue.add(livre);
            }
        }
        return queue;
       // return rechercher(livres, titre, annee, auteur);
    }


}
