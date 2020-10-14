package com.aelion.utils;

public final class RandomInteger {
	public static int getRandomInteger(int max) {
		double randomizer = Math.random();
		
		return (int) (Math.random()*(max));
	}
}
