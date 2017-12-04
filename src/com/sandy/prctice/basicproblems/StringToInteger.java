package com.sandy.prctice.basicproblems;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the string : ");
		 String str=sc.nextLine();
		 int result=parseInt(str);
		 System.out.println(result);

	}

	private static int parseInt(String str) {
		
        int i = 0, number = 0;
        boolean isNegative = false;
        int len = str.length();
        if( str.charAt(0) == '-' ){
            isNegative = true;
            i = 1;
        }
        while( i < len ){
            number *= 10;
            number += ( str.charAt(i++) - '0' );
        }
		return isNegative?-number:number;
	}

}
