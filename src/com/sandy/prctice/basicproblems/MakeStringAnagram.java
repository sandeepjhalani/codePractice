package com.sandy.prctice.basicproblems;

import java.util.Scanner;

public class MakeStringAnagram {

 public static int remAnagram(String str1, String str2)
 {
    
     int count1[] = new int[26]; 
     int count2[] = new int[26];

     for (int i = 0; i < str1.length() ; i++)
         count1[str1.charAt(i) -'a']++;
  
   
     for (int i = 0; i < str2.length() ; i++)
         count2[str2.charAt(i) -'a']++;

     
     int result = 0;
     for (int i = 0; i < 26; i++)
         result += Math.abs(count1[i] -
                            count2[i]);
     return result;
 }


 public static void main(String[] args)
 {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter the first string : ");
	 String str1=sc.nextLine();
	
	 System.out.println("Enter the second string : ");
	 String str2=sc.nextLine();
     System.out.println(remAnagram(str1, str2));
     sc.close();
 }
}
