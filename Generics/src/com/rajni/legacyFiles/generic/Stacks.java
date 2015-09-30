/**
 * 
 */
package com.rajni.legacyFiles.generic;


/**
 * @author rajni.ubhi
 *
 */
public class Stacks {
	public static  <T> Stack<T> reverse(Stack<T> in) {
		Stack<T> out = new ArrayStack<T>();
		while(!in.empty()) {
			out.push(in.pop());
		}
		return out;
	}
}
