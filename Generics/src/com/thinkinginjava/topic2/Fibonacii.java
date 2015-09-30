/**
 * 
 */
package com.thinkinginjava.topic2;

/**
 * @author rajni.ubhi
 *
 */
public class Fibonacii implements Generator<Integer>{

	private int count = 0;
	
	/**
	 * This is a recursive function
	 * */
	public int fib(int n) {
		if(n < 2) {
			return 1;
		} else {
			return fib(n-2) + fib(n-1);
		}
	}
	/** (non-Javadoc)
	 * @see com.thinkinginjava.topic2.Generator#next()
	 */
	@Override
	public Integer next() {
		// TODO Auto-generated method stub
		return fib(count++);
	}

	public static void main(String[] args) {
		Fibonacii fib = new Fibonacii();
		for(int i = 0 ;i < 18 ; i++) {
			System.out.println(fib.next());
		}
	}
}
