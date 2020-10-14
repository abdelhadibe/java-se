package com.aelion.blackjack;

abstract public class Carte extends Famille {
	
	protected String name; // As, Roi, Dame, ...
	protected int valeur;
	
	public Carte(String couleur, String famille) {
		// Appelle explicitement le constructeur de la classe parente
		super(famille, couleur);
	}
	
	public String getNomCarte() {
		return name;
	}

	public int getValeur() {
		return valeur;
	}
	protected void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
}
