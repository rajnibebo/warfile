/**
 * 
 */
package com.thinkinginjava.topic2;

import java.util.Iterator;

/**
 * @author rajni.ubhi
 *
 */
public class IterableFibonacii extends Fibonacii implements Iterable<Integer>{

	private int n;
	
	/**
	 * 
	 */
	public IterableFibonacii() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	public IterableFibonacii(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
	}
	
	/** (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return n > 0;
			}

			@Override
			public Integer next() {
				// TODO Auto-generated method stub
				n--;
				return IterableFibonacii.this.next();
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		for(int i : new IterableFibonacii(10)) {
			System.out.println(i);
		}
	}
}
