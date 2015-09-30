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
public class Lists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<?> l1 = factory();
	}

	public static <T> List<T> factory() {
		return new ArrayList<T>();
	}
}
