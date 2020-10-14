package com.aelion.cards;

public final class As extends Carte {
	private static final String nomCarte = "As";
	private static final int valeurCarte = 11;
	
	public As(String couleur, String famille) {
		super(couleur, famille);
		// TODO Auto-generated constructor stub
		this.name = As.nomCarte;
		this.valeur = As.valeurCarte;
	}

	@Override
	public void retourner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Carte retourner(boolean next) {
		// TODO Auto-generated method stub
		return this;
	}

}
