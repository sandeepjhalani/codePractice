/**
 * 
 */
package com.sandy.practice.datastructure;

/**
 * @author jhalani
 *
 */
public interface IStack<T> {

	public boolean push(T t);
	
	public T pop() throws EmptyListException;
	
	public T peek() throws EmptyListException;
	
	public boolean search(T t) throws EmptyListException ;
	
	public int size();
	
	public void displayList() ;
}
