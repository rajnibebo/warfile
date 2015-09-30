/**
 * 
 */
package com.thinkinginjava.topic3;

import com.thinkinginjava.topic2.Generator;

/**
 * @author rajni.ubhi
 *
 */
class Customer {
	private static long counter = 1;
	private final long id = counter++;
	
	/**
	 * 
	 */
	private Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Customer "+id;
	}
	
	public static Generator<Customer> generator() {
		return new Generator<Customer>() {
			
			@Override
			public Customer next() {
				// TODO Auto-generated method stub
				return new Customer();
			}
		};
	}
}
