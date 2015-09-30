/**
 * 
 */
package com.thinkinginjava.topic3;

import java.util.ArrayList;

/**
 * @author rajni.ubhi
 *
 */
public class Aisle extends ArrayList<Shelf>{

	/**
	 * 
	 */
	public Aisle(int nShelves,int nProducts) {
		// TODO Auto-generated constructor stub
		for(int i = 0 ;i < nShelves;i++) {
			add(new Shelf(nProducts));
		}
	}
}
