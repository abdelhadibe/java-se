package com.aelion.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.aelion.factory.CarteFactory;

public class Sabot {

	public List<Carte> setCartes() {
		List<Carte> sabot = new ArrayList<Carte>();
				
		// Associe à chaque couleur les familles des cartes à jouer
		HashMap<String, HashMap<String, List<String>>> families 
			= new HashMap<String, HashMap<String, List<String>>>();
		
		// Let's populate the Big HashMap
		families
			.put(
					"Rouge",
					new HashMap<String, List<String>>()
			);
		families.put(
				"Noir",
				new HashMap<String, List<String>>()
		);
		
		String[] colors = {"Rouge", "Noir"};
		String[] blackFamilies = {"Pique", "Trèfle"};
		String[] redFamilies = {"Coeur", "Carreau"};
		String[] cardsType = {"As", "Roi", "Dame", "Valet"};
		
		// Next... Populate inner HashMap with Family and CardTypes
		families.get("Rouge").put(
			"Coeur",
			new ArrayList<String>()
		);
		families.get("Rouge").put(
				"Carreau",
				new ArrayList<String>()
		);
		families.get("Noir").put(
				"Pique",
				new ArrayList<String>()
		);
		families.get("Noir").put(
				"Trèfle",
				new ArrayList<String>()
		);
		
		// Finally, put all Cartes types in the inner ArrayList
		// Les cartes spécifiques dont on dispose
		
		
		families.forEach((String color, HashMap<String, List<String>> type) -> {
			type.forEach((String family, List<String> types) -> {
				types.addAll(Arrays.asList(cardsType));
			});
		});
		
		// Réconciliation Objet et Fonctionnel : les lambdas
		families.forEach((String color, HashMap<String, List<String>> type) -> {
			type.forEach((String family, List<String> typesCarte) -> {
				typesCarte.forEach((String typeCarte) -> {
					sabot.add(CarteFactory.getCarte(typeCarte, family, color));
				});
			});
		});
		
		return sabot;
	}
}
