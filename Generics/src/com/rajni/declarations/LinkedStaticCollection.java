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
public class LinkedStaticCollection<E> extends AbstractCollection<E> {

	private int size = 0;
	private Node<E> current = new Node<E>(null);
	private Node<E> last = current;
	
	/**
	 * 
	 */
	public LinkedStaticCollection() {
		// TODO Auto-generated constructor stub
	}
	
	public LinkedStaticCollection(Collection<? extends E> coll) {
		// TODO Auto-generated constructor stub
		addAll(coll);
	}
	
	public boolean add(E elt) {
		last.next = new Node<E>(elt);
		last = last.next;
		size++;
		return true;
	}
	
	private static class Node<T> {
		private T elememt;
		private Node<T> next;
		
		/**
		 * 
		 */
		public Node(T element) {
			// TODO Auto-generated constructor stub
			this.elememt = element;
		}
	}

	private static class LinekdIterator<T> implements Iterator<T>{
		private Node<T> current;
		
		/**
		 * 
		 */
		public LinekdIterator(Node<T> current) {
			// TODO Auto-generated constructor stub
			this.current = current;
		}

		/* (non-Javadoc)
		 * @see java.util.Iterator#hasNext()
		 */
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current.next != null;
		}

		/* (non-Javadoc)
		 * @see java.util.Iterator#next()
		 */
		@Override
		public T next() {
			// TODO Auto-generated method stub
			if(current.next != null) {
				current = current.next;
				return current.elememt;
			} else {
				throw new NoSuchElementException();
			}
			
		}

		/* (non-Javadoc)
		 * @see java.util.Iterator#remove()
		 */
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
		
		
	}
	/** (non-Javadoc)
	 * @see java.util.AbstractCollection#iterator()
	 */
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new LinekdIterator<E>(current);
	}

	/** (non-Javadoc)
	 * @see java.util.AbstractCollection#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
