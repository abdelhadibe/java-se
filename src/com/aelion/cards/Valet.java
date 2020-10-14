package com.aelion.cards;

public final class Valet extends Carte {
	private static final String nomCarte = "Valet";
	private static final int valeurCarte = 8;
	
	public Valet(String couleur, String famille) {
		super(couleur, famille);
		// TODO Auto-generated constructor stub
		this.name = Valet.nomCarte;
		this.valeur = Valet.valeurCarte;
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
