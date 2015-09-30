/**
 * 
 */
package com.thinkinginjava.topic3;

import com.thinkinginjava.topic2.Generator;

/**
 * @author rajni.ubhi
 *
 */
public class BasicConstructor<T> implements Generator<T>{
	
	Class<T> type;
	
	/**
	 * 
	 */
	public BasicConstructor(Class<T> t) {
		// TODO Auto-generated constructor stub
		this.type = t;
	}
	/* (non-Javadoc)
	 * @see com.thinkinginjava.topic2.Generator#next()
	 */
	@Override
	public T next() {
		// TODO Auto-generated method stub
		try {
			return type.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new IllegalArgumentException();
		}
		
	}

	public static <T> Generator<T> create(Class<T> type) {
		return new BasicConstructor<T>(type);
	}
	
	public static void main(String[] args) {
		Generator<String> basic = create(String.class);
		System.out.println(basic.next());
	}
}
