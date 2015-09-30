/**
 * 
 */
package com.rajni.wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class TypeParameter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = "one";
		List<Object> objs = Arrays.<Object>asList("Rajni",1,3,502.23);
		List<Integer> ints = Arrays.asList(1,3);
		System.out.println(objs.contains(objs));
		System.out.println(objs.containsAll(ints));
		System.out.println(ints.contains(obj));
		System.out.println(ints.containsAll(ints));
		
		//List<?> types = new ArrayList<?>();
		
		ArrayList<String> str = new ArrayList<>();
		str.add("Rajni");
		str.add("Ubhi");
		
		ArrayList<String> str1 = new ArrayList<>();
		str1.add("Rajni1");
		str1.add("Ubhi1");
		
		ArrayList<Integer> str3 = new ArrayList<>();
		str3.add(1);
		str3.add(2);
		
		List<List<String>> list = new ArrayList<List<String>>();
		list.add(str);
		list.add(str1);
		
		List<List<String>> list1 = new ArrayList<List<String>>();
		list1.add(str);
		list1.add(str1);
		
		List<List<Integer>> list3 = new ArrayList<List<Integer>>();
		list3.add(str3);
		list3.add(str3);
		
		List<Object> listObj = TypeParameter.<Object>listE(list,list1,list3);
		
		
		List<Number> nums = new ArrayList<Number>();
		nums.add(3);
		nums.add(25);
		
		List<Object> objects = new ArrayList<Object>();
		objects.add("Rajni");
		objects.add(25);

		List<? super Integer> nums1 = nums;
		nums1.add(1);
	
		System.out.println(objects);
		
 	}

	public static void reverse(List<?> list) {
		List<Object> objs = new ArrayList<>(list);
		for(int i = 0 ; i < list.size() ; i++) {
			//list.set(i, objs.get(list.size()-i-1));
		}
	}
	
	public static <T> List<T> listE(T... ts) {
		List<T> list = new ArrayList<>();
		for(T t : ts) {
			list.add(t);
		}
		return list;
		
	}
}
