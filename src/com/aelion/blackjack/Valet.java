package com.aelion.blackjack;

public final class Valet extends Carte {
	private static final String nomCarte = "Valet";
	private static final int valeurCarte = 11;
	public Valet(String couleur, String famille) {
		super(couleur, famille);
		// TODO Auto-generated constructor stub
		this.name = Valet.nomCarte;
		this.valeur = Valet.valeurCarte;
	}

}
