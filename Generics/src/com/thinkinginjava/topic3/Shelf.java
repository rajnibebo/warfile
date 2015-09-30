/**
 * 
 */
package com.thinkinginjava.topic3;

import java.util.ArrayList;

/**
 * @author rajni.ubhi
 *
 */
public class Shelf extends ArrayList<Product>{
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}
