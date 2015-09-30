/**
 * 
 */
package com.thinkinginjava.topic4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class ArrayMaker<T> {
	private Class<T> type;
	 
	/**
	 * 
	 */
	public ArrayMaker(Class<T> type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
	@SuppressWarnings("unchecked")
	T[] create(int size) {
		return (T[]) Array.newInstance(type, size);
	}
	
	public static void main(String[] args) {
		ArrayMaker<String> array = new ArrayMaker<>(String.class);
		System.out.println(Arrays.toString(array.create(10)));
	}
}
