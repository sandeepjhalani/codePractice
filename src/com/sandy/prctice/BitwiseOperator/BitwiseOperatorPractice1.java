package com.sandy.prctice.BitwiseOperator;

import java.util.Scanner;

public class BitwiseOperatorPractice1 {

	static int add(int x, int y)
    {
        int carry;
        while(y!=0)
        {
            carry = x & y;
            System.out.println("carry : "+carry);
            x = x ^ y;
            System.out.println("x : "+x);
            y = carry << 1;
            System.out.println("y : "+y
            		);
        }
        return x;
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers to be added:");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("The Summation is: "+add(x, y));
        input.close();
    }

}
