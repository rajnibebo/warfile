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
public class Practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> nList = new ArrayList<>();
		nList.add("Rajni");
		
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(11);
		
		List<Double> dbls = new ArrayList<>();
		dbls.add(1.0);
		dbls.add(11.0);
		
		//List<? extends Number> nums = list(); // At this point u have no info which list is coming
		//nums.addAll(null); // thus can not add anything other than null
		
		List<? super Number> nums1 = nList; // can not assign lists which are at a lower level than number
		nums1.add(1.23);
		nums1.add(1); 
		System.out.println(nums1.get(0));// At this point u can't know which exact value u'll get
		
		count(nums1,10);
		System.out.println(nums1);
		System.out.println(sums(ints));
		System.out.println("Method CountNSum");
		countNsum(new ArrayList<Number>());
	}

	static List<? extends Number> list() {
		return null;
	}
	
	static int sums(List<? extends Number> list) {
		int sum = 0;
		for(Number n : list) {
			sum+=n.doubleValue();
		}
		return sum;
	}
	
	static void count(List<? super Number> list,int n) {
		for(int i = 0 ; i < n ; i++) {
			list.add(i);
		}
	}
	
	static void countNsum(List<Number> list) {
		count(list, 10);
		System.out.println(sums(list));
	}
}
