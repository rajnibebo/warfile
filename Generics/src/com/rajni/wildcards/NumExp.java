/**
 * 
 */
package com.rajni.wildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class NumExp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
	//	List<Number> nums = ints;
		Integer[] intArray = {1,2,3};
		Object[] nums = intArray;
		nums[0] = 3.14;
	//	System.out.println(nums[0]);
		
		List<A> list = new ArrayList<>();
		list.add(new A());
		list.add(new B());
		list.add(new C());
		System.out.println(list);
		readvalues(list);
		
		List<B> bList = new ArrayList<B>();
		
		List<? extends A> aList = bList;
		aList = new ArrayList<C>();
		
		
		
	}

	public static void readvalues(List<A> list ) {
		for(A s : list) {
			System.out.println(s);
		}
	}
}
