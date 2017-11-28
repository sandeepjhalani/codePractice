package com.sandy.prctice.basicproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PermutaionCombinationAgo {
	static Set<Integer> resultSet= new HashSet<Integer>();
	static  int base=0;
	static  int result=0;
	
	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		
		System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n-1;i++){
        	if(arr[i]!=0)
        		continue;
        	arr[i]=8;
        	arr[i+1]=9;
        	
        }
       // permute(arr,0);
        ArrayList<ArrayList<Integer>> list= permuteUnique(arr);
        for(ArrayList<Integer> list1:list){
        	    if(list1.get(0)!=9)
            	   System.out.println(list1);
            
        }
	}
	
	public static ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		returnList.add(new ArrayList<Integer>());
	 
		for (int i = 0; i < num.length; i++) {
			Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
			for (List<Integer> l : returnList) {
				for (int j = 0; j < l.size() + 1; j++) {
					l.add(j, num[i]);
					ArrayList<Integer> T = new ArrayList<Integer>(l);
					l.remove(j);
					currentSet.add(T);
				}
			}
			returnList = new ArrayList<ArrayList<Integer>>(currentSet);
		}
	 
		return returnList;
	}

	/*private static void permute(int[] arr, int k) {
		
		if (k == arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==9 && i==0){
					break;
				}
				//System.out.print(" [" + arr[i] + "] ");
				result+=arr[i]
						*((int) Math.pow(10,(arr.length-i-1)));
				//resultSet.addAll(Arrays.asList(arr));
			}
			resultSet.add(result);
			System.out.println(result);
			System.out.println();
		} else {
			for (int i = k; i < arr.length; i++) {
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;

				permute(arr, k + 1);

				temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
			}
		}

	}*/

}
