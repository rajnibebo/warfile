/**
 * 
 */
package com.rajni.comparable.part1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class MaxFindGenerics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Number> nums = Arrays.<Number>asList(1,2.0,2.36,454);
	//	System.out.println(max(nums));
	}

	public static <T extends Comparable<T>> T max(Collection<T> list) {
		Iterator<? extends T> coll = list.iterator();
		T t = coll.next();
		while(coll.hasNext()) {
			T elt = coll.next();
			if(t.compareTo(elt) < 0) {
				t = elt;
			}
		}
		return t;
	}
}
