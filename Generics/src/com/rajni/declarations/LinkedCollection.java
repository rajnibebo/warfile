/**
 * 
 */
package com.rajni.declarations;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author rajni.ubhi
 *
 */
public class LinkedCollection<E> extends AbstractCollection<E> {

	private Node first = new Node(null);
	private Node last = first;
	private int size = 0;
	
	/**
	 * 
	 */
	public LinkedCollection() {
		// TODO Auto-generated constructor stub
	}
	
	public LinkedCollection(Collection<? extends E> coll) {
		// TODO Auto-generated constructor stub
		addAll(coll);
	}
	private class Node {
		private E element;
		private Node next = null;
		/**
		 * 
		 */
		public Node(E elt) {
			// TODO Auto-generated constructor stub
			element = elt;
		}
	}

	/** (non-Javadoc)
	 * @see java.util.AbstractCollection#iterator()
	 */
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {
			private Node current = first;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return current != null;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				if(current != null) {
					current = current.next;
					return current.element;
				} else {
					throw new NoSuchElementException();
				}
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
		};
	}

	/** (non-Javadoc)
	 * @see java.util.AbstractCollection#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public boolean add(E elt) {
		last.next = new Node(elt);
		last = last.next;
		size++;
		return true;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
