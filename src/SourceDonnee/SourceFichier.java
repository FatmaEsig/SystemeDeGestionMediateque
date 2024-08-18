package SourceDonnee;/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SourceFichier implements SourceDonneeStrategie{
	List<String[]> listeMedias = new ArrayList<>(); // pour stocker tout le media
	List<String[]> listeLivres = new ArrayList<>(); // pour stocker les livres
	List<String[]> listeVideos = new ArrayList<>(); // pour stoquer les videos

	
	// peut etre extention pour retourner les données selon son extention à la fin du fichier
	//String extention;

	
	/* 
		if extention egale à  .csv renvoie methode fichierCSV
		
		if extention egle à .txt renvoie methode fichierTXT
		
		if ... 
		etc
	
	*/
	
	
	// methodes

	public List<String[]> loadMedia(){

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("dao/media.csv");
		if (inputStream == null) {
			System.out.println("Le fichier n'est pas trouvé");
			return null;
		}

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
			// sauter l'entete
			reader.readLine();

			String ligne;
			while ((ligne = reader.readLine()) != null){
				String[] champs = ligne.split(";");

				if(champs.length > 5) {
					String type = champs[5]; // le champs type qui détermine si le type est livre ou video

					//Filtrage des champs vides
					List<String> champsNonVides = new ArrayList<>();
					for (String champ : champs) {
						if (champ != null && !champ.trim().isEmpty()){
							champsNonVides.add(champ);
						}
					}
					// Conversion de la liste en tableau
					String[] champsFiltres = champsNonVides.toArray(new String[0]);

					listeMedias.add(champsFiltres);


					if("livre".equalsIgnoreCase(type)){
						if(champs.length >=9){
							listeLivres.add(new String[]{
								champs[0], champs[1], champs[2], champs[3], champs[4], champs[5],
										champs[6], champs[7], champs[8]
							});
						}else {
							System.out.println("ligne manquante pour le livre :" + ligne);
						}
					}else if ("video".equalsIgnoreCase(type)){
						if (champs.length >= 15) {
							listeVideos.add(new String[]{
								champs[0], champs[1], champs[2], champs[3], champs[4], champs[5],
								champs[9], champs[10], champs[11], champs[12], champs[13], champs[14]
							}); // j'ignore les champs dons video n'a pas besoin
						} else{
							System.out.println("ligne manquante pour video : " + ligne);
						}
					} else {
						System.out.println("Le type de média n'existe pas : " + ligne);
					}
				} else {
					System.out.println("ligne n'est pas trouvé : " + ligne);

				}
			}
		} catch (IOException e) {
			System.out.println("Erreur lors de la lecture du fichier : " + e.getMessage());
		}

		return listeMedias;
	}
	public List<String[]> loadAdherents(){

		return null;
	};
	// getters et setters


	public List<String[]> getListeLivres() {
		return listeLivres;
	}

	public void setListeLivres(List<String[]> listeLivres) {
		this.listeLivres = listeLivres;
	}

	public List<String[]> getListeVideos() {
		return listeVideos;
	}

	public void setListeVideos(List<String[]> listeVideos) {
		this.listeVideos = listeVideos;
	}
}