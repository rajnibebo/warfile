/**
 * 
 */
package com.thinkinginjava.topic2;

import java.util.Iterator;
import java.util.Random;

/**
 * @author rajni.ubhi
 *
 */
public class CoffeeGenerator implements Generator<Coffee> , Iterable<Coffee>{

	private Class[] types = {Latte.class , Mocha.class , Cappuccino.class ,Americano.class , Breve.class};
	private Random rand = new Random(47);
	private int size = 0;
	
	/**
	 * 
	 */
	public CoffeeGenerator() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	public CoffeeGenerator(int size) {
		// TODO Auto-generated constructor stub
		System.out.println("constructor runs");
		this.size = size;
	}
	
	/** (non-Javadoc)
	 * @see com.thinkinginjava.topic2.Generator#next()
	 */
	@Override
	public Coffee next() {
		// TODO Auto-generated method stub
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
	
	public static void main(String[] args) {
		CoffeeGenerator gen = new CoffeeGenerator();
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(gen.next());
		}
		for(Coffee c : new CoffeeGenerator(5)) {
			System.out.println(c);
		}
		// both works the same way compiler will convert upper loop to the following way
		for(Iterator<Coffee> it = new CoffeeGenerator(10).iterator() ; it.hasNext();) {
			Coffee c = it.next();
			System.out.println(c);
		}
	}

	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;
		
		public boolean hasNext() {
			return count >= 0;
		}
		/** (non-Javadoc)
		 * @see java.util.Iterator#next()
		 */
		@Override
		public Coffee next() {
			// TODO Auto-generated method stub
			count--;
			return CoffeeGenerator.this.next();
		}
		/** (non-Javadoc)
		 * @see java.util.Iterator#remove()
		 */
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			throw new UnsupportedOperationException();
		}
		
		
	}
	/** (non-Javadoc)
	 * @see java.lang.Iterable#iterator()
	 */
	@Override
	public Iterator<Coffee> iterator() {
		// TODO Auto-generated method stub
		System.out.println("Iterator runs");
		return new CoffeeIterator();
	//	return null;
	}

}
