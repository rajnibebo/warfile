/**
 * 
 */
package com.rajni.legacyFiles;

/**
 * @author rajni.ubhi
 *
 */
public class Stacks {

	public static Stack reverse(Stack in) {
		Stack out = new ArrayStack();
		while(!in.empty()) {
			out.push(in.pop());
		}
		return out;
	}
}
