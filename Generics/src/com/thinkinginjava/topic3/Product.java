/**
 * 
 */
package com.thinkinginjava.topic3;

import java.util.Random;

import com.thinkinginjava.topic2.Generator;

/**
 * @author rajni.ubhi
 *
 */
public class Product {
	private final int id ; 
	private String description;
	private double price;
	
	/**
	 * 
	 */
	public Product(int id , String description ,double price) {
		// TODO Auto-generated constructor stub
		this.id =id;
		this.description = description;
		this.price = price;
	}
	
	public static Generator<Product> generator = new Generator<Product>() {
		
		private Random rand = new Random(47);
		@Override
		public Product next() {
			// TODO Auto-generated method stub
			return new Product(rand.nextInt(1000), "Product", Math.round(rand.nextDouble() * 1000.0)+0.99);
		}
	};
	
	public String toString() {
		return "id :"+id+", Description :"+description+", price : $"+price;
	}
}
