package com.sandy.practice.datastructure;

public class LinkedList<T> implements IList<T>  {
     private Node<T> head;
     private Node<T> tail;
    private static int modCount=0;

     
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	@Override
	public boolean add(T t) {
		Node<T> node= new Node<T>();
		node.setData(t);
		Node<T> trav=head;
		if(isEmpty()){
			 head=node;
			 tail=node.getNext();
			 modCount++;
		}
		else {
			while(trav.getNext()!=null){
				trav=trav.getNext();
			}
			trav.setNext(node);
			tail=node.getNext();
			 modCount++;
		}
		return true;
	}

	@Override
	public boolean addAtStart(T t) {
		Node<T> node= new Node<T>();
		node.setData(t);
		Node<T> trav=head;
		if(isEmpty()){
			 head=node;
			 tail=node.getNext();
			 modCount++;
		}
		else {
			head=node;
			head.setNext(trav);
			 modCount++;
		}
		return true;
	}

	@Override
	public boolean delete() throws EmptyListException {
		Node<T> trav=head;
		if(isEmpty()){
			throw new EmptyListException("LinkedList is empty");
		}
		else {
			while(trav.getNext().getNext()!=null){
				trav=trav.getNext();
			}
			trav.setNext(null);
			tail=trav;
			 modCount--;
		}
		return true;
	}

	@Override
	public boolean addAtPosition(T t, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAtPos(T t, int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAtStart() throws EmptyListException {
		Node<T> trav=head;
		if(isEmpty()){
			throw new EmptyListException("LinkedList is empty");
		}
		else {
			head=trav.getNext();
			trav=null;
			 modCount--;
		}
		return true;
	}

	@Override
	public boolean isEmpty() {
		if(head==null)
			return true;
		return false;
	}

	@Override
	public int size() {
		return modCount;
	}

	@Override
	public void displayList() {
		Node<T> trav = head;

		while (trav != null) {
			System.out.print("["+trav.getData() + "] --> ");
			trav = trav.getNext();
		}
		System.out.println(" X");

	}

	@Override
	public boolean contains(T t) throws EmptyListException {
		Node<T> trav=head;
		if(isEmpty())
			throw new EmptyListException("LinkedList is empty");
		else{
			while(trav.getData()!=null){
				if(trav.getData().equals(t)){
					return true;
				}
				trav=trav.getNext();
			}
		}
	
		return false;
	}

	@Override
	public void clear() {
		head=null;
	}

	@Override
	public int indexOf(T t) throws EmptyListException {
		Node<T> trav=head;
		int count=0;
		if(isEmpty())
			throw new EmptyListException("LinkedList is empty");
		else{
			while(trav!=null){
				if(trav.getData().equals(t)){
					return count;
				}
				count++;
				trav=trav.getNext();
			}
		}
		return -1;
	}

	@Override
	public void reverseList() throws EmptyListException {
		Node<T> trav=head;
		if(isEmpty())
			throw new EmptyListException("LinkedList is empty");
		else{
			Node<T> current=trav;
			Node<T> prev=null;
			while(trav!= null){
				current=trav;
				trav=trav.getNext();
				current.setNext(prev);
				prev=current;
			}
			head=current;
		}
		
	}

	

	

	
		
	}
