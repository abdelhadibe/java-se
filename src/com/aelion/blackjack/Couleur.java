package com.aelion.blackjack;

abstract public class Couleur {
	private String name;
	
	public Couleur(String name) {
		this.name = name;
	}
	
	public String getCouleur() {
		return this.name;
	}
}