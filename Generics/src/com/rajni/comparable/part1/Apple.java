/**
 * 
 */
package com.rajni.comparable.part1;

/**
 * @author rajni.ubhi
 * 
 */
class Apple extends Fruit implements Comparable<Apple> {

	private int size = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Apple o) {
		// TODO Auto-generated method stub
		return this.size < o.size ? -1 : this.size == o.size ? 0 : 1;

	}

}
