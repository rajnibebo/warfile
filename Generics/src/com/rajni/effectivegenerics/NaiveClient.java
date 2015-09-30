/**
 * 
 */
package com.rajni.effectivegenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class NaiveClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		LegacyLibrary.addItems(list);  // no warning
		
		List<Integer> ints = LegacyLibrary.getItems();  //unchecked warning
		System.out.println(ints.get(0));
		System.out.println(ints.get(1)); // runs fine
		
		int n = 0;
		for(int i : ints) {
			n+=i;
			System.out.println("In Loop : "+n);
		}
		System.out.println(n);
	}

}
