/**
 * 
 */
package com.thinkinginjava.topic3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author rajni.ubhi
 *
 */
public class New {
	public static <K,V> Map<K,V> map() {
		return new HashMap<K,V>();
	}
	
	public static <T> List<T> list() {
		return new ArrayList<T>();
	}
	
	public static <T> LinkedList<T> likedList() {
		return new LinkedList<T>();
	}
	
	public static <T> Set<T> set() {
		return new HashSet<T>();
	}
	
	public static <T> Queue<T> queue() {
		return new LinkedList<T>();
	}
	
	public static void main(String[] args) {
		Map<String, ? extends Number> map = New.map();
		System.out.println(map);
		f1(map);
		//f1(New.map());   // this does not compile
	}
	
	static void f1(Map<String , ? extends Number> map) {
		System.out.println("Inside f1()");
	}
}
