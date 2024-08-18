import media.Livre;
import media.Video;
import source_donnee.SourceDonneeStrategie;
import source_donnee.SourceFichier;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("======= Mediathèque ========");
        System.out.println(" ");
        System.out.println("----------------------------");

        // Il faut interaction avec utilisateur, scanner ???

        /* Instructions possibles

        Instruction 1 (qui se pose au démarrage:

        - Pour lister tous nos médias, ecrivez "lister"
        - Pour lister que tous les livres, ecrivez "livres"
        - Pour lister que tout les videos, ecrivez "videos"

        - Pour lister tous les médias disponibles, écrivez "disponibles"
        (pour lister tout les livres disponible, pour lister tout les video disponible : livres disponible, videos disponibles)

        Instruction 2

        - Pour emprunter un livre, ecrivez le nom du livre + emprunter.

        - Pour retourner un livre, ecrivez le nom du livre + retourner.

        --

        - Pour emprunter un video, ecrivez le nom du video + emprunter.

        - Pour retourner un video, ecrivez le nom du video + retourner.


        Instruction 3

        - Malheureusement le livre que vous souhaitiez emprunté est actuellement pas disponible, mais vous pouvez
        le réserver. Ecrivez "Reserver" pour réserver.

        - Vous etes ajouté à la liste d'attente pour ce media : nomMedia, date de reservation : date d'ajourdhui

        - Le media choisi est disponible, maintenant vous pouvez le posseder. La date de retour est  ...
        (rappel : pour retourner le media emprunté, ecrivez le nom du media + retourner



        */
        // test pour récuperer donnée adherents avec BDD

        /*
        SourceDonneeStrategie sourceBdd = new SourceBdd();
        List<String[]> listeAdherent = sourceBdd.loadAdherents();
        for (String[] adherent : listeAdherent) {
            for (String info : adherent) {
                System.out.println(info + " ");
            }
            System.out.println();
        }

        System.out.println("======================================");
        // test pour récuperer données medias

        List<String[]> listeMedia = sourceBdd.loadMedia();
        for (String[] medias : listeMedia) {
            for (String media : medias) {
                System.out.println(media + " ");
            }
            System.out.println();
        }

         */
        System.out.println("======================================");
        //test depuis source fichier media

        SourceDonneeStrategie sourceFichier = new SourceFichier();
        List<String[]> listeMedia = sourceFichier.loadMedia();
        List<String[]> listeLivres = ((SourceFichier) sourceFichier).getListeLivres();
        List<String[]> listeVideos = ((SourceFichier) sourceFichier).getListeVideos();

        if (listeMedia != null){
            System.out.println("Liste complete des médias :");
            for (String[] medias : listeMedia) {
                for (String media : medias) {
                    System.out.println(media + " ");
                }
                System.out.println();
            }
        }

        /*
        // affichage de la liste des livres
        if (listeLivres != null){
            System.out.println("Liste des livres :");
            for (String[] livre : listeLivres) {
                for (String champ : livre) {
                    System.out.println(champ + " ");
                }
            }
            System.out.println();
        }

        System.out.println();
        // affichage des videos
        if(listeVideos != null){
            System.out.println("Liste des vidéos : ");
            for (String[] video : listeVideos) {
                for (String champ : video) {
                    System.out.println(champ + " ");
                }
            }
            System.out.println();
        }
*/
        System.out.println();
        System.out.println(" ========================  ");
        System.out.println();

        List<String[]> listeAdherents = sourceFichier.loadAdherents();
        if(listeAdherents != null){
            System.out.println("Liste des Adhérents : ");
            for (String[] adherent : listeAdherents) {
                for (String champ : adherent) {
                    System.out.println(champ + " ");
                }
                System.out.println();
            }
        }

        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
    // -----------------------------------------------------------------------
	    // Fabrique du media.Media à instancier
		// Strategie à utiliser dans Fabrique
        MediaFabrique mediaFabrique = new MediaFabrique(); // doit avoir 2 types d'objets

        //essaie
        // Listes pour stocker les objets livre et video
        List<Livre> livres = new ArrayList<>();
        List<Video> videos = new ArrayList<>();

        // iteration
        for (String[] donneesLivre : listeLivres) {
            Livre livre = mediaFabrique.creerLivre(donneesLivre);
            if (livre != null){     // si donnee n'est pas vide
                livres.add(livre);
            }
        }

        // iteration
        for (String[] donnesVideo : listeVideos) {
            Video video = mediaFabrique.creerVideo(donnesVideo);
            if (video != null){
                videos.add(video);
            }
        }

        // les titres livres avec l'auteur
        System.out.println("Liste des Livres :");
        for (Livre livre : livres) {
            System.out.println(livre.getTitre() + " par " + livre.getAuteur());
        }

        System.out.println("-----------------------------------");

        // les titres vidéos et leur auteur
        System.out.println("Liste des Vidéos :");
        for (Video video : videos) {
            System.out.println(video.getTitre() + " par " + video.getAuteur());
        }

        System.out.println("");
        System.out.println("===========================================");
        System.out.println("");
        // ----------------------------------------------
        // Catalogue


    }
}