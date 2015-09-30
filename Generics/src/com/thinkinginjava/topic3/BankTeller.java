/**
 * 
 */
package com.thinkinginjava.topic3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * @author rajni.ubhi
 *
 */
public class BankTeller {
	public static void serve(Customer cust , Teller teller) {
		System.out.println(teller+" serves "+cust);
	}
	
	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 10);
		List<Teller> teller = new ArrayList<Teller>();
		Generators.fill(teller, Teller.generator(), 4);
		
		for(Customer cust : line) {
			serve(cust, teller.get(rand.nextInt(teller.size())));
		}
	}
}
