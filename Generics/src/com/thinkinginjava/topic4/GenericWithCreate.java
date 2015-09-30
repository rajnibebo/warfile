/**
 * 
 */
package com.thinkinginjava.topic4;

/**
 * @author rajni.ubhi
 *
 */
abstract class GenericWithCreate<T> {
	final T element;
	/**
	 * 
	 */
	public GenericWithCreate() {
		// TODO Auto-generated constructor stub
		element = create();
	}
	
	abstract T create();
}
