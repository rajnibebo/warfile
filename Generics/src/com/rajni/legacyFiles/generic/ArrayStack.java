/**
 * 
 */
package com.rajni.legacyFiles.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class ArrayStack<E> implements Stack<E> {

	private List<E> list;
	
	/**
	 * 
	 */
	public ArrayStack() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<E>();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/** (non-Javadoc)
	 * @see com.rajni.legacyFiles.generic.Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		list.add(e);
	}

	/** (non-Javadoc)
	 * @see com.rajni.legacyFiles.generic.Stack#pop()
	 */
	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return list.remove(list.size()-1);
	}

	/** (non-Javadoc)
	 * @see com.rajni.legacyFiles.generic.Stack#empty()
	 */
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return list.size() == 0;
	}
	
	public String toString() {
		return "Stack : "+list;
	}

}
