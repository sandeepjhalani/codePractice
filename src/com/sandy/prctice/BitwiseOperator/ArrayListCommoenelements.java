package com.sandy.prctice.BitwiseOperator;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCommoenelements {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		list.add(10);list.add(20);list.add(30);
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(40);list1.add(50);list1.add(30);
		List<Integer> list2=new ArrayList<Integer>();
		list2.addAll(list);
		list2.retainAll(list1);
		
        //list.retainAll(list1);
        
        list.addAll(list1);
       // list1.retainAll(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list2);
	}

}
