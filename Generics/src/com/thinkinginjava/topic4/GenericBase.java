/**
 * 
 */
package com.thinkinginjava.topic4;

/**
 * @author rajni.ubhi
 *
 */
public class GenericBase<T> {
	private T element;
	
	public void setElement(T t) {
		this.element = t;
	}
	
	public T getElement() {
		return element;
	}
}
