package com.aelion.blackjack;

public final class Dame extends Carte {
	private static final String nomCarte = "Dame";
	private static final int valeurCarte = 12;
	
	public Dame(String couleur, String famille) {
		super(couleur, famille);
		// TODO Auto-generated constructor stub
		this.name = Dame.nomCarte;
		this.valeur = Dame.valeurCarte;
	}

}
