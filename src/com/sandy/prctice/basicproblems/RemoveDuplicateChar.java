package com.sandy.prctice.basicproblems;

import java.util.Scanner;

public class RemoveDuplicateChar {

	public static String removeDuplicates(char[] str) {
		if (str == null)
			return "String can not be null"; // if the array does not
												// exist..nothing to do return.
		int len = str.length; // get the array length.
		if (len < 2)
			return "String length is less then 2"; // if its less than 2..can't
													// have duplicates..return.
		boolean[] hit = new boolean[256];
		for (int i = 0; i < 256; ++i) {
			hit[i] = false;
		}
		hit[str[0]] = true;
		int tail = 1;
		for (int i = 1; i < len; ++i) {
			if (!hit[str[i]]) {
				str[tail] = str[i];
				++tail;
				hit[str[i]] = true;
			}
		}
		str[tail] = 0;
		return String.valueOf(str);
		}
	public static String removeDuplicatesWithoutSpaceComplexity(char[] str) {
		if (str == null)
			return "String can not be null"; // if the array does not
												// exist..nothing to do return.
		int len = str.length; // get the array length.
		if (len < 2)
			return "String length is less then 2"; // if its less than 2..can't
													// have duplicates..return.
		int tail = 1;

		for (int i = 1; i < len; ++i) {
			int j;
			for (j = 0; j < tail; ++j) {
				if (str[i] == str[j])
					break;
			}
			if (j == tail) {
				str[tail] = str[i];
				++tail;
			}
		}
		str[tail] = 0;
		return String.valueOf(str);
		}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the first string : ");
		 String str1=sc.nextLine();
		
	     System.out.println(removeDuplicatesWithoutSpaceComplexity(str1.toCharArray()));
	     sc.close();

	}

}
