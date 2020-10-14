package com.aelion.blackjack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.aelion.cards.Carte;
import com.aelion.cards.Sabot;
import com.aelion.factory.CarteFactory;
import com.aelion.interfaces.Jouable;
import com.aelion.interfaces.Players;
import com.aelion.user.User;
import com.aelion.utils.RandomInteger;

public class BlackJack implements Jouable, Players {
	
	private HashMap<String, User> players;
	private static int MAX_PLAYERS = 2;
	
	private List<Carte> sabot;
	
	public BlackJack() {
		players = new HashMap<String, User>();
		
		// Two players : Bank and User
		try {
			addPlayer("Banque", new User("Casino", "Banque"));
			addPlayer("JL", new User("Jean-Luc", "JL"));
		} catch(Exception e) {
			e.getMessage();
		}
		
		// Create cards sabot
		this.sabot = new Sabot().setCartes();
	}

	@Override
	public void addPlayer(User user) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void addPlayer(String whatOf, User user) throws Exception {
		if (players.size() < BlackJack.MAX_PLAYERS) {
			// TODO Auto-generated method stub
			players.put(whatOf, user);
		}
		throw new Exception("Blackjack cannot have more than " + BlackJack.MAX_PLAYERS + " players");
	}
	@Override
	public void jouer() {
		// Bank plays
		User bank = players.get("Banque");
		Carte bankPlayedCard = sabot.get(RandomInteger.getRandomInteger(sabot.size() - 1));
		
		// Then player plays
		Carte userPlayedCard = sabot.get(RandomInteger.getRandomInteger(sabot.size() - 1));
		
		// Finally compare bank's card and player's card
		if (bankPlayedCard.getValeur() > userPlayedCard.getValeur()) {
			System.out.println("Bank wons with " + cardOutput(bankPlayedCard));
		} else if (bankPlayedCard.getValeur() < userPlayedCard.getValeur()) {
			System.out.println("Player wons with "  + cardOutput(userPlayedCard));
		} else {
			System.out.println("Card values was equal, play again");
		}
	}
	
	private String cardOutput(Carte carte) {
		String output = carte.getNomCarte() + " ";
		output += carte.getFamille() + " " + carte.getValeur() + "\n";
		
		return output;
	}
}
