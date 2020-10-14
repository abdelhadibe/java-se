package com.aelion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.aelion.blackjack.BlackJack;
import com.aelion.cards.As;
import com.aelion.cards.Carte;
import com.aelion.cards.Dame;
import com.aelion.cards.Famille;
import com.aelion.cards.Roi;
import com.aelion.cards.Valet;
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
		// Let's play blackjack
		BlackJack game = new BlackJack();
		game.jouer();
	}
	


}
