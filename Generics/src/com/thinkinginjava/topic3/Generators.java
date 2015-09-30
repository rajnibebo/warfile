/**
 * 
 */
package com.thinkinginjava.topic3;

import java.util.Collection;

import com.thinkinginjava.topic2.Generator;

/**
 * @author rajni.ubhi
 *
 */
public class Generators {
	public static <T> Collection<T> fill(Collection<T> coll , Generator<T> gen , int n) {
		for(int i = 0 ;i < n ; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
}
