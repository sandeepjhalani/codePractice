/**
 * 
 */
package com.sandy.practice.datastructure;


/**
 * @author jhalani
 *
 * @param <T>
 */
public interface IList<T> {
	
	
	public boolean add(T t);

	public boolean addAtStart(T t);

	public boolean delete() throws EmptyListException;

	public boolean addAtPosition(T t, int index);

	public boolean deleteAtPos(T t, int index);

	public boolean deleteAtStart() throws EmptyListException;

	public boolean isEmpty();

	public int size();
	
	public void displayList();
	
	public boolean contains(T t) throws EmptyListException;
	
	public void clear();
	
	public int indexOf(T t) throws EmptyListException;
	
	public void reverseList() throws EmptyListException;;
	
	

}
