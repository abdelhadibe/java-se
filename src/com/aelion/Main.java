package com.aelion;

import com.aelion.blackjack.BlackJack;
import com.aelion.user.User;
import com.aelion.utils.Keyboard;

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
		User bank = new User()
				.lastName("Bank")
				.firstName("Bank")
				.pseudo("Bank");
		User player = new User()
				.lastName("Aubert")
				.firstName("Jean-Luc")
				.pseudo("Winner");
		
		boolean response = Keyboard.readBool();
		System.out.println(response ? "User responds okay" : "User responds ko");
		
		// Let's play blackjack
		BlackJack game = new BlackJack(bank, player);
		game.jouer();
	}
	


}
