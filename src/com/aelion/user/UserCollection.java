/**
 * 
 */
package com.aelion.user;

/**
 * @author jean-luc
 *
 */
public final class UserCollection {
	private User[] users = new User[4];
	
	private int userCounter = 0;
	
	public UserCollection addUser(User user) {
		if (this.userCounter < 4) {
			this.users[userCounter] = user;
			this.userCounter++;
		}
		return this;
	}
	
	public User get(int index) {
		return this.users[index];
	}
	
	public int size() {
		return this.users.length;
	}
}
