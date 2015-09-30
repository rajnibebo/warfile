/**
 * 
 */
package com.rajni.comparable.part1;

import java.util.ArrayList;
import java.util.List;

import com.rajni.comparable.MaxFindGenerics;

/**
 * @author rajni.ubhi
 *
 */
class Orange extends Fruit implements Comparable<Orange>{

	private int size = 2;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
		apples.add(new Apple());
		
		List<Orange> oranges = new ArrayList<>();
		oranges.add(new Orange());
		oranges.add(new Orange());
		
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Apple());
		fruits.add(new Orange());
		
		System.out.println(MaxFindGenerics.max(apples));
		System.out.println(MaxFindGenerics.max(oranges));
	//	System.out.println(MaxFindGenerics.max(fruits));
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Orange o) {
		// TODO Auto-generated method stub
		return this.size < o.size ? -1 : this.size == o.size ? 0 : 1;
	}

}
