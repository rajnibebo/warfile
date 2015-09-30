/**
 * 
 */
package com.thinkinginjava.topic5;

import java.awt.Color;

/**
 * @author rajni.ubhi
 * 
 */
public class Colored<T extends HasColor> {
	T item;

	Colored(T item) {
		this.item = item;
	}
	T getItem() {
		return item;
	}
	
	Color getColor() {
		return item.getColor();
	}
}
