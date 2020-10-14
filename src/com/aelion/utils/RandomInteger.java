package com.aelion.utils;

import java.util.Random;

public final class RandomInteger {
	public static int getRandomInteger(int max) {
		double randomizer = Math.random();
		
		return (int) (Math.random()*(max));
	}
	
	public static int getRandomInteger(int max, boolean asNextInt) {
		Random randomize = new Random();
		return randomize.nextInt(max);
	}
}
