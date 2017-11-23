package com.sandy.practice.datastructure;

class Node<T> {
	private Node<T> next;
	private T data;
	
	
	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Node(Node<T> next, T data) {
		super();
		this.next = next;
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	

}
