/**
 * 
 */
package com.rajni.effectivegenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class InheritedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> original = new ArrayList<>();
		List<String> delegated  = ListStrings.wrap(original);
		List<String> inherited = new ArrayListString(original);
		
		delegated.add("one");
		inherited.add("two");
		
		try {
			((List)delegated).add(3);
		} catch(ClassCastException e) {
			System.out.println("Exception caught");
		}
		((List) inherited).add(3);
		System.out.println(original);
		System.out.println(delegated);
		System.out.println(inherited);
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		
		((List)ints).add(3.0);
		//int i = ints.get(2);
		System.out.println(ints.getClass().getSimpleName()); // it prints ArrayList 
					//i.e. why it prints all contents without throwing classCastException
	}

}

