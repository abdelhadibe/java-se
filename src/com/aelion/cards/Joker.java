package com.aelion.cards;

public final class Joker extends Carte {

	public Joker(String couleur, String famille) {
		super(couleur, famille);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retourner() {
		// TODO Auto-generated method stub
		this.retourner(true);
		
	}

	@Override
	public Carte retourner(boolean next) {
		// TODO Auto-generated method stub
		return null;
	}

	public void turnOn() {
		// your staff here
	}
}
