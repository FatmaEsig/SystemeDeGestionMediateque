package SourceDonnee;/*
Auteur: Fatma Aydin
Systeme de gestion de Mediateque
2024 - Rattrapage
*/


import java.util.List;

public interface SourceDonneeStrategie{
	
	List<String[]> loadMedia();
    List<String[]> loadAdherents();
	

	
}