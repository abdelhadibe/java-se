package com.aelion.factory;

import com.aelion.blackjack.As;
import com.aelion.blackjack.Carte;
import com.aelion.blackjack.Dame;
import com.aelion.blackjack.Roi;
import com.aelion.blackjack.Valet;

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
