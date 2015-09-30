/**
 * 
 */
package com.rajni.legacyFiles;

import com.rajni.declarations.Cell;

/**
 * @author rajni.ubhi
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new ArrayStack();
		for(int i = 0; i < 10 ; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		
		/*int top = ((Integer)stack.pop()).intValue();
		System.out.println(top);*/
		
		Stack reverse = Stacks.reverse(stack);
		System.out.println(reverse);
		
	//	Cell<String> str = new Cell();
	}

}
