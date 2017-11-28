package com.sandy.prctice.basicproblems;

public class ReplaceSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String str = "                       str          str       r     str         str                              ";
//		String str = "Testing the string with trailing spaces             ";
//		String str = "             Testing the string with leading spaces";
//		String str = "Testing the string with no leading no trailing spaces";
//		String str = "Testing the string with                 lots of spaces in between";
//		String str = "             Testing the string with leading and trailing spaces         ";
		String str = "             Testing the string                                                  with leading, trailing and spaces in between                                    ";
//		String str = null;
		// System.out.println((int)' ');
		char[] charArr = str.toCharArray();
		boolean frontFlag = true;
		boolean endFlag = true;
		int i = 0;
		System.out.println("str.length:: "+str.length());
		
		for (int j = str.length() - 1;; i++, j--) {

			if (((int) charArr[i] == 32) && frontFlag) {
				charArr[i] = '$';
			} else
				frontFlag = false;

			if (((int) charArr[j] == 32) && endFlag) {
				charArr[j] = '$';
			} else
				endFlag = false;

			if (!frontFlag && !endFlag) {
				break;
			}
		}
		System.out.println("length:: "+charArr.length + ", loop count:: " + i);
		str = String.valueOf(charArr);
		System.out.println(str);
	}

}
