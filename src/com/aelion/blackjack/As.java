package com.aelion.blackjack;

public final class As extends Carte {
	private static final String nomCarte = "As";
	private static final int valeurCarte = 1;
	
	public As(String couleur, String famille) {
		super(couleur, famille);
		// TODO Auto-generated constructor stub
		this.name = As.nomCarte;
		this.valeur = As.valeurCarte;
	}

}
