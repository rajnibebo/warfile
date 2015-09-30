/**
 * 
 */
package com.thinkinginjava.topic3;

import java.util.ArrayList;

/**
 * @author rajni.ubhi
 *
 */
public class Store extends ArrayList<Aisle>{
    
	/**
	 * 
	 */
	public Store(int nAisles,int nShelves,int nProducts) {
		// TODO Auto-generated constructor stub
		for(int i = 0 ; i < nAisles ; i++) {
			add(new Aisle(nShelves, nProducts));
		}
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(Aisle a : this) {
			for(Shelf s : a) {
				for(Product p : s) {
					result.append(p);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Store(14, 5, 10));
	}
}
