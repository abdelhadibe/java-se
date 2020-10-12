package com.aelion;

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
	}

}
