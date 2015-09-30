/**
 * 
 */
package com.rajni.reifiable;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class Right {

	
	@SuppressWarnings("unchecked")
	public static <T> T[] toArray(List<T> list ,T[] a) {
		if(a.length < list.size()) {
			a = (T[]) Array.newInstance(a.getClass().getComponentType(), list.size());
		}
		int i = 0;
		for(T t : list) {
			a[i++] = t;
		}
		/*if(i < a.length) {
			a[i] = null;
		}*/
		return a;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("Rajni","Ubhi");
		List<String> list2 = Arrays.asList("Rajni1","Ubhi1");
		
		List<List<String>> list3 = Arrays.asList(list1,list2);
		
		System.out.println(Arrays.toString(toArray(list1, new String[10])));
		System.out.println(Arrays.toString(toArray(list2, new String[10])));
		System.out.println(Arrays.toString(toArray(list3, new List[10])));
	}

}
