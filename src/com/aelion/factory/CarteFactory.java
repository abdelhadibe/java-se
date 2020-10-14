package com.aelion.factory;

import com.aelion.cards.As;
import com.aelion.cards.Carte;
import com.aelion.cards.Dame;
import com.aelion.cards.Roi;
import com.aelion.cards.Valet;

public final class CarteFactory {
	public static Carte getCarte(
		String typeCarte,
		String familleCarte,
		String couleurCarte) {
		
		switch (typeCarte) {
			case "As":
				return new As(couleurCarte, familleCarte);
				
			case "Roi":
				return new Roi(couleurCarte, familleCarte);
				
			case "Dame":
				return new Dame(couleurCarte, familleCarte);
				
			case "Valet":
				return new Valet(couleurCarte, familleCarte);
				
			default:
				return null;
		}
	}
}
