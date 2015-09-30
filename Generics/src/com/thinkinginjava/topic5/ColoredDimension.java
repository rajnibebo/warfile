/**
 * 
 */
package com.thinkinginjava.topic5;

import java.awt.Color;

/**
 * @author rajni.ubhi
 *
 */
public class ColoredDimension<T extends Dimension & HasColor> {
	T item;
	
	/**
	 * 
	 */
	public ColoredDimension(T item) {
		// TODO Auto-generated constructor stub
		this.item = item;
	}
	
	Color getColor() {
		return item.getColor();
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
}
