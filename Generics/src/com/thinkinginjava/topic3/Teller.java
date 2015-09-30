/**
 * 
 */
package com.thinkinginjava.topic3;

import com.thinkinginjava.topic2.Generator;

/**
 * @author rajni.ubhi
 *
 */
public class Teller {
	private static long counter = 1;
	private final long id = counter++;

	private Teller() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Teller "+id;
	}
	
	public static Generator<Teller> generator() {
		return new Generator<Teller>() {
			
			@Override
			public Teller next() {
				// TODO Auto-generated method stub
				return new Teller();
			}
		};
	}
}
