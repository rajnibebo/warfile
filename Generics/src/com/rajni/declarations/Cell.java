/**
 * 
 */
package com.rajni.declarations;

/**
 * @author rajni.ubhi
 *
 */
public class Cell<T> {

	private final int id;
	private final T value;
	
	private static int count = 0;
	private static synchronized int nextId() {
		return count++;
	}
	
	/**
	 * 
	 */
	public Cell(T value) {
		// TODO Auto-generated constructor stub
		this.value = value;
		this.id = nextId();
	}
	
	
	/**
	 * @return the count
	 */
	public static synchronized int getCount() {
		return count;
	}

	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the value
	 */
	public T getValue() {
		return value;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cell<String> cell = new Cell<String>("Rajni");
		Cell<Integer> ints = new Cell<Integer>(24);
		System.out.println("Id : "+cell.getId()+" , Value : "+cell.getValue());
		System.out.println("Id : "+ints.getId()+" , Value : "+ints.getValue());
		System.out.println(Cell.getCount()); // can not be call with any generic even <Object>
	}

}
