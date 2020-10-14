package com.aelion;

import com.aelion.blackjack.BlackJack;

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
