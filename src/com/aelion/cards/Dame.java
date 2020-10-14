package com.aelion.cards;

public final class Dame extends Carte {
	private static final String nomCarte = "Dame";
	private static final int valeurCarte = 9;
	
	public Dame(String couleur, String famille) {
		super(couleur, famille);
		// TODO Auto-generated constructor stub
		this.name = Dame.nomCarte;
		this.valeur = Dame.valeurCarte;
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
