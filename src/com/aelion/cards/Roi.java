package com.aelion.cards;

public final class Roi extends Carte {
	private static final String nomCarte = "Roi";
	private static final int valeurCarte = 10;
	
	public Roi(String couleur, String famille) {
		super(couleur, famille);
		// TODO Auto-generated constructor stub
		this.name = Roi.nomCarte;
		this.valeur = Roi.valeurCarte;
	}

	@Override
	public void retourner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Carte retourner(boolean next) {
		// TODO Auto-generated method stub
		return null;
	}

}
