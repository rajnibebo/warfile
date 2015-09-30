/**
 * 
 */
package com.rajni.legacyFiles.minimal;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajni.ubhi
 * 
 */
@SuppressWarnings("unchecked")
public class ArrayStack<E> implements Stack<E> {

	private List list;
	
	/**
	 * 
	 */
	public ArrayStack() {
		// TODO Auto-generated constructor stub
		list = new ArrayList();
	}
	/**
	 * (non-Javadoc)
	 * 
	 * @see com.rajni.legacyFiles.Stack#push(java.lang.Object)
	 */
	@Override
	public void push(E obj) { // TODO Auto-generated method stub
		list.add(obj);
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.rajni.legacyFiles.Stack#pop()
	 */
	@Override
	public E pop() { // TODO Auto-generated method stub
		Object obj = list.remove(list.size()-1);
		return (E)obj;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see com.rajni.legacyFiles.Stack#empty()
	 */
	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return list.size() == 0;
	}

	public String toString() {
		return "Stack : "+list;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
