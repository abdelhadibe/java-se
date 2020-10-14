package com.aelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.aelion.blackjack.As;
import com.aelion.blackjack.Carte;
import com.aelion.blackjack.Dame;
import com.aelion.blackjack.Famille;
import com.aelion.blackjack.Roi;
import com.aelion.blackjack.Valet;
import com.aelion.factory.CarteFactory;
import com.aelion.user.User; // Importe le package qui définit la classe à utiliser
import com.aelion.user.UserCollection;
public class Main {

	/**
	 * Main entry point of the application
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	
	public Main() {
		UserCollection userCollection = new UserCollection();
		
		User moi = new User(); // Make a brand new User instance (aka User object)
		//moi.lastName = "Aubert";
		moi
			.lastName("Aubert")
			.firstName("Jean-Luc") // Sets the lastname and firstname of the User object using chained methods
			.pseudo("monpseudo")
			.age(52);
		
		userCollection.addUser(moi);

		
		User lui = new User()
				.lastName("No chain")
				.firstName("None")
				.pseudo("Casper")
				.age(150);
		
		userCollection.addUser(lui);
		
		userCollection.addUser(new User("Bond", "James", "007", 75));
		
		User anonymous = new User();
		userCollection.addUser(anonymous);
		
		User notAllowed = new User()
				.firstName("Nobody")
				.lastName("Interdit")
				.age(40)
				.pseudo("Not Allowed");
		userCollection.addUser(notAllowed);
		
		// Loop over each users to print object
		for (int i = 0; i < userCollection.size(); i++) {
			System.out.println("#" + i + " : " + userCollection.get(i));
		}
		
		// Créer le jeu de cartes
		this.setCartes();
	}
	
	private void setCartes() {
		// Contiendra toutes les cartes à jouer
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


		 for (Carte carte : sabot) { 
			 System.out.println( "Nom : " +
				carte.getNomCarte() + "\nFamille :" + carte.getFamille() + "\nCouleur : " +
				carte.getCouleur() + "\nValeur : " + carte.getValeur()
			); 
		 }

		 
		sabot.forEach((Carte carte) -> {
			System.out.println(carte.getNomCarte());
		});
		
		/*
		sabot.stream()
			.filter((Carte carte) -> carte.getNomCarte().contentEquals("As"))
			.forEach((Carte carte) -> {
				System.out.println("Got As " + carte.getCouleur() + 
					" from " + carte.getFamille() + " family"
				);	
			});
		*/
	}

}
