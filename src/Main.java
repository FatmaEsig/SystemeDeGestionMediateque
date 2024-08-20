import media.Livre;
import media.Video;
import recherche_catalogue.RechercheParAnnee;
import recherche_catalogue.RechercheParAuteur;
import recherche_catalogue.RechercheParTitre;
import recherche_multicritere_catalogue.RechercheMulticritere;
import source_donnee.SourceDonneeStrategie;
import source_donnee.SourceFichier;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("======= Mediathèque ========");
        System.out.println(" ");
        System.out.println("----------------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


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

        /*
        // lister les adherents directement
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
        */

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

        Catalogue catalogue = new Catalogue();

        // ajout des medias (media (tout), livre, video) au catalogue

        for (Livre livre : livres) {
            catalogue.ajouterLivre(new Livre(livre.getId(),livre.getTitre(),livre.getAuteur(), livre.getDateDePublication(),
                    livre.getPrix(), livre.getType(), livre.getISBN(), livre.getGenre(), livre.getResume()));
        }

        for (Video video : videos) {
            catalogue.ajouterVideo(new Video(video.getId(), video.getTitre(), video.getAuteur(), video.getDateDePublication(),
                    video.getPrix(), video.getType(), video.getDuree(), video.getFormat(), video.getResolution(), video.getUrl(),
                    video.getNombreDeVues(), video.getDescription()));
        }

        // application du trie

        // Recherche par titre
        catalogue.setStrategie(new RechercheParTitre());
        PriorityQueue<Livre> resultatTitre = catalogue.rechercheLivre("1984");
        afficherResultatsLivre(resultatTitre); // methode

        // Recherche par annee de publication

        catalogue.setStrategie(new RechercheParAnnee());
        PriorityQueue<Livre> resultatAnnee = catalogue.rechercheLivre("1813");
        afficherResultatsLivre(resultatAnnee);

        // Recherche par auteur du livre
        catalogue.setStrategie(new RechercheParAuteur());
        PriorityQueue<Livre> resultatAuteur = catalogue.rechercheLivre("Harper Lee");
        afficherResultatsLivre(resultatAuteur);

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        // ----------------------------------------------------
        // Recherche Multicritère
        // 1. Recherche par titre (1/3)
        catalogue.setStrategieMulti(new RechercheMulticritere());
        PriorityQueue<Livre> resultatTitreMulti = catalogue.rechercherMulti("1984");
        afficherResultatsLivre(resultatTitreMulti);

        // 2. Recherche par titre et date (2/3)
        PriorityQueue<Livre> resultatTitreDate = catalogue.rechercheMulti("1984", 1949);
        afficherResultatsLivre(resultatTitreDate);

        // 3. Recherche par titre, date et auteur
        PriorityQueue<Livre> resultatTitreDateAuteur = catalogue.rechercherMulti("1984", 1949, "George Orwell");
        afficherResultatsLivre(resultatTitreDateAuteur);

        /*
        RechercheStrategie rechercheTitre = new RechercheParTitre();
        PriorityQueue<Livre> livresTrieParTitre = catalogue.rechercheLivre(rechercheTitre);

        // affichage des livres par titre
        System.out.println("Livres filtré par titre :");
        while(!livresTrieParTitre.isEmpty()){
            Livre livre = livresTrieParTitre.poll();  // recupere l'element avec la plus haute priorité
            System.out.println(livre.getTitre());
        }
*/
        System.out.println();
        System.out.println("========================================");
        System.out.println();
        // -------------------------------------------------------------------
        // Adhérents  - Ajout des objets dans la classe Adherent
        System.out.println("La liste des Adhérents");

        List<String[]> listeAdherents = sourceFichier.loadAdherents();
        if(listeAdherents != null){
            for (String[] donneeAdherent : listeAdherents) {
              int id = Integer.parseInt(donneeAdherent[0]);
              String prenom = donneeAdherent[1];
              String nom = donneeAdherent[2];
              String adresse = donneeAdherent[3];
              long numTel = Long.parseLong(donneeAdherent[4]);
              LocalDate dateDeNaiss = LocalDate.parse(donneeAdherent[5], formatter);

              Adherent adherent = new Adherent(id, prenom, nom, adresse, numTel, dateDeNaiss);

              Adherent.ajouterAdherent(adherent);
            }
        }
        // Affichage des adhérents
        Adherent.afficherAdherents();
        //------
        // Ajoute d'un nouveau adhérent

        // Modification d'un adhérent

        // suppression d'un adherent


        System.out.println();
        System.out.println("=============================");
        System.out.println();
        //------------------------------------------------
        // Empunter un media.

        // pour emprunter un media, il faut verifier si la personne est adhérent ou pas en vérifiant le hashmap du Adherent.
        // sinon on affiche un message

        // si le media n'est pas disponible, afficher message


        System.out.println();
        System.out.println("=========================");
        System.out.println();
        // ----------------------------------------------
        // Reserver un media - liste des personnes qui sont en attentes et les medias reservés


        System.out.println("fin");
    }
    // methode de resultat de recherche pour les priorityqueues
    private static void afficherResultatsLivre(PriorityQueue<Livre> resultats){
        while(!resultats.isEmpty()){
            Livre livre = resultats.poll();
            System.out.println("ID: " + livre.getId() + ", Titre: " + livre.getTitre() + ". Auteur: " + livre.getAuteur() + ", Date: " + livre.getDateDePublication());
        }
    }

}



