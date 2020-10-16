package com.aelion.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public final class Keyboard {
	private static Scanner keyboard = new Scanner(System.in);
	private static String userResponse = null;
	
	private static String prompt;
	
	public static boolean readBool() {
		Keyboard.prompt = "Répondre par ";
		return Keyboard._readBool();
	}
	
	public static boolean readBool(String prompt) {
		Keyboard.prompt = prompt;
		return Keyboard._readBool();
	}
	
	/**
	 * Usage : boolean status = Keyboard.readBool()
	 * @return 
	 * @return 
	 * @return
	 */
	private static boolean _readBool() {
		String[] responses = {"oui", "non", "o", "n"};
		boolean outputStatus = false;
		
		// Boucler sur une entrée utilisateur...
		while (userResponse == null) {
			System.out.print(Keyboard.prompt + " [oui - o - non - n] : ");
			userResponse = Keyboard.keyboard.next();
			
			Iterable<String> responseStream = Arrays.asList(responses);
			
			// Using a stream
			Optional<String> answer = ((Collection<String>) responseStream)
				.stream()
				.filter((response) -> response.equalsIgnoreCase(userResponse))
				.findFirst();
			
			if (answer.isPresent()) {
				// La réponse est acceptable
				// Quelle est la réponse...
				
				if (answer.get().equals("oui") || answer.get().equals("o")) {
					outputStatus = true;
				} else {
					outputStatus = false;
				}
			} else {
				// La réponse n'est pas acceptable

				userResponse = null;
			}
		}
		return outputStatus;
	}
	
	public static String readString() {
		return null;
	}
	
	public static int readInt() {
		return 0;
	}
}
