package com.sandy.prctice.BitwiseOperator;

import javax.jws.soap.SOAPBinding;

public class StringPractice {
	public static boolean endsLy(String str) {
	 if(str.length()>=2 && (str.substring(str.length()-2).equals("ly")))
		    return true;
		    return false;
		}
	
	public static String lastChars(String a, String b) {
		  if(a.length()>0 && b.length()>0)
		      return ""+a.charAt(0)+b.charAt(b.length()-1);
		  else if(a.length()==0 && b.length()==0)
			  return "@@";
		  if(a.length()==0 &&  b.length()>0)
		      return "@"+b.charAt(b.length()-1);
		   else if(a.length()>0 && b.length()==0)
		     return ""+a.charAt(0)+"@";
		   return "@@";
		}
	public String seeColor(String str) {
		  if(str.startsWith("red"))
		  return "red";
		   if(str.startsWith("blue"))
		  return "blue";
		  return "";
		}
	
	public static String doubleChar(String str) {
		  String strNew="";
		  for(int i=0;i<str.length();i++){
		    strNew=strNew+str.charAt(i)+str.charAt(i);
		  }
		  return strNew;
		}
	
	public int countHi(String str) {
		  int count=0;
		  for(int i=0;i<str.length()-1;i++){
		        if((str.substring(i,i+2)).equals("hi"))
		          count++;
		  }
		  
		  return count;
		  
		}

	public static void main(String[] args) {
	  System.out.println(doubleChar("oddly"));
	  System.out.println(lastChars("dqd","dfwaqfd"));
	  System.out.println(endsLy("oddly"));

	}

}
