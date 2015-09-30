/**
 * 
 */
package com.rajni.reifiable;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;

/**
 * @author rajni.ubhi
 *
 */
public class ArrayListCustom<E> extends AbstractCollection<E> implements RandomAccess {

	private E[] elements;
	private int size;
	
	/**
	 * 
	 */
	public ArrayListCustom(int cap) {
		// TODO Auto-generated constructor stub
		if(cap < 0) {
			throw new IllegalArgumentException();
		}
		elements = (E[]) new Object[cap];
	}
	
	/**
	 * 
	 */
	public ArrayListCustom() {
		// TODO Auto-generated constructor stub
		this(10);
	}
	
	public ArrayListCustom(Collection<? extends E> coll) {
		this(coll.size());
		addAll(coll);
		
	}
	
	public void ensureCapacity(int oldcap) {
		if(oldcap < elements.length) {
			int mincap = Math.max(oldcap, (elements.length * 3)/2 +1);
			E[] oldArr = elements;
			elements = (E[]) new Object[mincap];
			System.arraycopy(oldArr, 0, elements, 0, size);
		}
	}
	
	
	
	/** (non-Javadoc)
	 * @see java.util.AbstractCollection#iterator()
	 */
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/** (non-Javadoc)
	 * @see java.util.AbstractCollection#size()
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
