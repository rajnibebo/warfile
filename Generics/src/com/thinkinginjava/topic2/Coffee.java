/**
 * 
 */
package com.thinkinginjava.topic2;

/**
 * @author rajni.ubhi
 *
 */
public class Coffee {

	private final int id = counter++;
	private static int counter = 0;
	
	public String toString() {
		return getClass().getSimpleName()+" : "+id;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
