package com.aelion.blackjack;

import java.util.HashMap;
import java.util.List;

import com.aelion.cards.Carte;
import com.aelion.cards.Sabot;
import com.aelion.interfaces.Jouable;
import com.aelion.interfaces.Players;
import com.aelion.user.User;
import com.aelion.user.UserCollection;
import com.aelion.utils.RandomInteger;

public class BlackJack implements Jouable, Players {
	
	private HashMap<String, User> players;
	private static int MAX_PLAYERS = 2;
	
	private List<Carte> sabot;
	
	public BlackJack() {
		this.players = new HashMap<String, User>();
		
		// Two players : Bank and User
		try {
			this.addPlayer("Banque", new User("Casino", "Banque"));
			this.addPlayer("Player", new User("Jean-Luc", "JL"));
		} catch(Exception e) {
			e.getMessage();
		}
		
		// Create cards sabot
		this.sabot = new Sabot().setCartes();
	}

	public BlackJack(User bank, User player) {
		try {
			this.addPlayer("Banque", bank);
		} catch(Exception e) {
			System.out.println("No more player were accepted");
		}
		
		try {
			this.addPlayer("Player", player);
		} catch(Exception e) {
			System.out.println("No more player were accepted");
		}
		
		// Create cards sabot
		this.sabot = new Sabot().setCartes();
	}
	
	public BlackJack(UserCollection users) {
		try {
			this.addPlayer("Bank", users.get(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			this.addPlayer("Player", users.get(1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Unused method for this context
	 */
	@Override
	public void addPlayer(User user) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void addPlayer(String whatOf, User user) throws Exception {
		if (this.players.size() < BlackJack.MAX_PLAYERS) {
			// TODO Auto-generated method stub
			this.players.put(whatOf, user);
		} else {
			throw new Exception("Blackjack cannot have more than " + BlackJack.MAX_PLAYERS + " players");
		}
		
	}
	
	@Override
	public void jouer() {
		// Bank plays
		User bank = players.get("Banque");
		Carte bankPlayedCard = this.sabot.get(RandomInteger.getRandomInteger(sabot.size(), true));
		
		// Then player plays
		Carte userPlayedCard = this.sabot.get(RandomInteger.getRandomInteger(sabot.size(), true));
		
		// @todo prefer implements Comparable interface to Carte
		//	so you can use compareTo between bank and player's card played
		// Got negative, positive or 0
		
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
