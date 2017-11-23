package com.sandy.practice.datastructure;


public class PracticeDataStructure {

	public static void main(String[] args) {
/*		IList<Integer> list= new LinkedList<Integer>();
	
		list.add(new Integer(8));
		list.add(new Integer(10));
		list.add(new Integer(20));
		//list.addAtStart(new Integer(30));
		list.add(new Integer(40));
		list.add(new Integer(50));
		list.add(new Integer(60));
		//list.addAtStart(new Integer(30));
		list.add(new Integer(70));
		//list.addAtStart(new Integer(50));
		//list.addAtStart(new Integer(30));
		list.displayList();
		System.out.println(list.size());
		try {
			list.deleteAtStart();
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		list.displayList();
		try {
			list.reverseList();
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list.displayList();
		try {
			System.out.println("Result of contains "+list.contains(new Integer(8)));
			System.out.println("Result of indexOf "+list.indexOf(new Integer(8)));
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Size : "+list.size());*/
	/*	IStack<Integer> s = new Stack<Integer>();
		s.push(new Integer(8));
		s.push(new Integer(10));
		s.push(new Integer(12));
		s.push(new Integer(14));
		s.push(new Integer(16));
		System.out.println("hello");
		s.displayList();
		
		
		try {
			System.out.println(s.pop());
			s.displayList();
			System.out.println(s.peek());
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		BinarySearchTree btree= new BinarySearchTree();
		btree.addTreeNode(30);
		btree.addTreeNode(20);
		btree.addTreeNode(60);
		btree.addTreeNode(15);
		btree.addTreeNode(40);
		btree.addTreeNode(27);
	//	btree.printLevelOrder();
		btree.preorder();
	//	btree.printLevelOrder();
		/*try {
			btree.print("InOrder1");
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//print(null);
		
  }

	private static void print(Object object) {
		System.out.println("Object");
		
	}
	private static void print(String str) {
		System.out.println("String");
		
	}

}
