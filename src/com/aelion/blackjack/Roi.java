package com.aelion.blackjack;

public final class Roi extends Carte {
	private static final String nomCarte = "Roi";
	private static final int valeurCarte = 13;
	
	public Roi(String couleur, String famille) {
		super(couleur, famille);
		// TODO Auto-generated constructor stub
		this.name = Roi.nomCarte;
		this.valeur = Roi.valeurCarte;
	}

}
