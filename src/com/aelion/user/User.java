/**
 * 
 */
package com.aelion.user;

/**
 * @author jean-luc
 *
 */
public class User {
	/**
	 * lastName for a User instance
	 */
	private String lastName;
	
	/**
	 * First name of a User instance
	 */
	private String firstName;
	
	
	private String pseudo;
	
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * Sets the lastName of this User instance
	 * @param lastName
	 * @return User
	 */
	public User lastName(String lastName) {
		this.lastName = lastName;
		
		return this;
	}
	
	/**
	 * Get the lastName of this User instance
	 * @return String
	 */
	public String lastName() {
		return this.lastName;
	}
	
	/**
	 * Sets the firstName of this User instance
	 * @param firstName
	 * @return
	 */
	public User firstName(String firstName) {
		this.firstName = firstName;
		
		return this;
	}
	
	public String firstName() {
		return this.firstName;
	}
}
