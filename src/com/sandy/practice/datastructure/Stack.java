package com.sandy.practice.datastructure;

public class Stack<T> implements IStack<T>{
    private Node<T> top;
    private Node<T> head;
	private int modCount=0;
    
    
	public Stack() {
		this.top = null;
		this.head=null;
	}

	@Override
	public boolean push(T t) {
		Node<T> newNode=new Node<T>();
		newNode.setData(t);
		if(top==null){
		   head=top=newNode;
		   modCount++;
		}
		else{
			top.setNext(newNode);
			top=newNode;
			modCount++;
		}
		return false;
	}

	@Override
	public T pop() throws EmptyListException {
		Node<T> trav=head;
		Node<T> prev=top;
		if(isEmpty())
			throw new EmptyListException("Stack is Empty");
		else{
			while(trav.getNext().getNext()!=null){
				trav=trav.getNext();
			}
			trav.setNext(null);
			top=trav;
			modCount--;
		}
		return prev.getData();
	}

	@Override
	public T peek() throws EmptyListException {
		if(isEmpty())
			throw new EmptyListException("Stack is Empty");
		return top.getData();
	}

	@Override
	public boolean search(Object t) throws EmptyListException {
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

	private boolean isEmpty() {
		if(size()==0)
		    return true;
		return false;
	}

	@Override
	public int size() {
		return modCount;
	}
	
	public void displayList() {
		Node<T> trav = head;

		while (trav != null) {
			System.out.print("["+trav.getData() + "] <-- ");
			trav = trav.getNext();
		}
		System.out.println(" TOP");

	}

}
