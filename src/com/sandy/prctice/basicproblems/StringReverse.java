package com.sandy.prctice.basicproblems;

public class StringReverse {
	

	
	public static void main(String[] args) {
		String input = "Be in present";
		char[] stringToReverse = input.toCharArray();
		stringToReverse=reverseString(stringToReverse);
		String s=stringToReverse.toString();
		printCharArray(stringToReverse);
		System.out.println(s);
	}

	/**
	 * @param stringToReverse
	 */
	private static void printCharArray(char[] stringToReverse) {
		for (char c : stringToReverse)
			System.out.print(c);
	}

	private static char[] reverseString(char[] stringToReverse) {
		int left, right = 0;
		right = stringToReverse.length - 1;
		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = stringToReverse[left];
			stringToReverse[left] = stringToReverse[right];
			stringToReverse[right] = temp;
		}
		return stringToReverse;
	}
}
