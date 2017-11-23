package com.sandy.prctice.BitwiseOperator;

public class NumberReverseRecursively {
	long reverse = 0;
	 public long reverseNumberRecursively(long number){
                reverse = (reverse*10)+(number%10);
                if(!(number<10))
	                reverseNumberRecursively(number/10);
	       
	        return reverse;
	    }
	     
	    public static void main(String a[]){
	    	NumberReverseRecursively nr = new NumberReverseRecursively();
	        System.out.println("Result: "+nr.reverseNumberRecursively(123456789101112l));
	    }
}
