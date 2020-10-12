package com.aelion;

import com.aelion.user.User; // Importe le package qui définit la classe à utiliser

public class Main {

	/**
	 * Main entry point of the application
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
		
		//Main firstMain = new Main();
		//Main secondMain = new Main("Java Dream Team");
		
	}
	
	public Main() {
		User moi = new User(); // Make a brand new User instance (aka User object)
		//moi.lastName = "Aubert";
		moi
			.lastName("Aubert")
			.firstName("Jean-Luc");// Sets the lastname and firstname of the User object using chained methods
		
		User lui = new User();
		lui.setLastName("No chain");
		lui.setFirstName("None");
		
		// Print the User object lastname
		System.out.println("Bonjour : " + moi.lastName() + " " + moi.firstName()); 
	}

}
