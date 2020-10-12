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
	
	/**
	 * Age of this User instance
	 */
	private int age;
	
	public User() {
		this.lastName = "anonymous";
		this.firstName = "anonymous";
		this.pseudo = "anonymous";
		this.age = 0;
	}
	
	public User(String lastname, String firstname, String pseudo, int age) {
		this.lastName = lastname;
		this.firstName = firstname;
		this.pseudo = pseudo;
		this.age = age;
	}
	
	public User age(int age) {
		this.age = age;
		return this;
	}
	
	public int age() {
		return this.age;
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
	
	public User pseudo(String pseudo) {
		this.pseudo = pseudo;
		
		return this;
	}
	
	public String pseudo() {
		return this.pseudo;
	}
	/**
	 * Override toString method inherited from Java Super Object
	 */
	public String toString() {
		return this.fullUser();
	}
	
	private String fullUser() {
		String out;
		
		out = "Name : " + this.lastName + "\n";
		out += "Firstname : " + this.firstName + "\n";
		out += "Pseudo : " + this.pseudo + "\n";
		out += "Age :" + this.age + "\n";
		
		return out;
	}
}
