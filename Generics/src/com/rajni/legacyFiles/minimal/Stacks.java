/**
 * 
 */
package com.rajni.legacyFiles.minimal;

/**
 * @author rajni.ubhi
 *
 */
@SuppressWarnings("unchecked")
public class Stacks {

	public static <T> Stack<T> reverse(Stack<T> in) {
		Stack out = new ArrayStack();
		while(!in.empty()) {
			out.push(in.pop());
		}
		return out;
	}
}
