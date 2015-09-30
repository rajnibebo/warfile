/**
 * 
 */
package com.rajni.reifiable;

import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class Promote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<String> promote (List<Object> list) {
		for(Object o : list) {
			if(!(o instanceof String)) {
				throw new IllegalArgumentException();
			}
		}
		return (List<String>) (List<?>) list;
	}
}
