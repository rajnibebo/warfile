/**
 * 
 */
package com.thinkinginjava.topic4;

/**
 * @author rajni.ubhi
 *
 */
public class ClassAsFactory<T> {
	T x;
	
	/**
	 * 
	 */
	public ClassAsFactory(Class<T> type) {
		// TODO Auto-generated constructor stub
		try {
			x = type.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
	
	public T get() {
		return x;
	}
	public static void main(String[] args) {
		ClassAsFactory<House> cls = new ClassAsFactory<>(House.class);
		House h = cls.get();
		System.out.println(cls+" Succeeded "+h);
		try {
			ClassAsFactory<Integer> cls1 = new ClassAsFactory<>(Integer.class);
		} catch(Exception e) {
			System.out.println("Instantiation Failed");
		}
	}
	
	public String toString() {
		return "ClassFactory : ";
	}
}
