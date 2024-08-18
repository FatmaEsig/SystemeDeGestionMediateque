package SourceDonnee;/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/

import java.util.List;

public class SourceFichier implements SourceDonneeStrategie{
	
	String lienFichier;
	
	// peut etre extention pour retourner les données selon son extention à la fin du fichier
	
	String extention;
	
	// constructeur
	
	/* 
		if extention egale à  .csv renvoie methode fichierCSV
		
		if extention egle à .txt renvoie methode fichierTXT
		
		if ... 
		etc
	
	*/
	
	
	// methodes

	public List<String[]> loadMedia(){
		return null;
	};
	public List<String[]> loadAdherents(){

		return null;
	};
	// getters et setters
	
	
	// toString
	
	
	
}