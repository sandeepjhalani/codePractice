package com.sandy.prctice.basicproblems;

public class StringWordsReverse {

	public static void main(String[] args) {
		String input = "Be in present";
		String [] strArr=input.split(" ");
		String result="";
		for(String s: strArr)
			result+=reverseString(s)+" ";
		System.out.println(result);
	}

	/**
	 * @param stringToReverse
	 */

	private static String reverseString(String stringToReverse) {
		int left, right = 0;
		char[] charArr=stringToReverse.toCharArray();
		right = charArr.length - 1;
		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = charArr[left];
			charArr[left] = charArr[right];
			charArr[right] = temp;
		}
		return String.valueOf(charArr);
	}

}
