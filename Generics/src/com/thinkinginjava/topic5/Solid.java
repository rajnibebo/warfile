/**
 * 
 */
package com.thinkinginjava.topic5;

/**
 * @author rajni.ubhi
 *
 */
public class Solid<T extends Dimension & HasColor & Weight> {
	T item;
	
	/**
	 * 
	 */
	public Solid(T item) {
		// TODO Auto-generated constructor stub
		this.item = item;
	}
	
	int getX() {
		return item.x;
	}
	
	int getY() {
		return item.y;
	}
	
	int getZ() {
		return item.z;
	}
	
	int weight() {
		return item.weight();
	}
}
