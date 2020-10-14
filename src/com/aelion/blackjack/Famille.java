package com.aelion.blackjack;

abstract public class Famille extends Couleur {
	private String nom;
	
	public Famille(String nom, String couleur) {
		super(couleur); // Appelle explicitement le constructeur parent
		this.nom = nom;
	}
	
	public String getFamille() {
		return this.nom;
	}
}
