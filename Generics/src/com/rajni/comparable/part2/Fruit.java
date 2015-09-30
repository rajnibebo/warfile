/**
 * 
 */
package com.rajni.comparable.part2;

import java.util.ArrayList;
import java.util.List;


/**
 * @author rajni.ubhi
 *
 */
public class Fruit implements Comparable<Fruit>{

	private int size = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
		apples.add(new Apple());
		
		List<RedApple> redApp = new ArrayList<>();
		redApp.add(new RedApple());
		redApp.add(new RedApple());
		
		List<Orange> oranges = new ArrayList<>();
		oranges.add(new Orange());
		oranges.add(new Orange());
		
		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Apple());
		fruits.add(new Orange());
		
		System.out.println(MaxFindGenerics.max(apples));
		System.out.println(MaxFindGenerics.max(oranges));
		System.out.println(MaxFindGenerics.max(fruits));
		System.out.println(MaxFindGenerics.max(redApp)); // <? extends T> 
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Fruit o) {
		// TODO Auto-generated method stub
		return this.size < o.size ? -1 : this.size == o.size ? 0 : 1;
	}

}
