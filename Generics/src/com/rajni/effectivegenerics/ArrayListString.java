/**
 * 
 */
package com.rajni.effectivegenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class ArrayListString extends ArrayList<String> implements ListString{

	/**
	 * 
	 */
	public ArrayListString() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public ArrayListString(Collection<? extends String> coll) {
		// TODO Auto-generated constructor stub
		super(coll);
	}
	
	public ArrayListString(int capacity) {
		// TODO Auto-generated constructor stub
		super(capacity);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<? extends List<?>> lists = Arrays.asList(ListStrings.wrap(Arrays.asList("Rajni","Ubhi")),
				Arrays.asList(1,2,3),
				ListStrings.wrap(Arrays.asList("Seven","Eight"))
				);
		
		ListString[] array = new ListString[2];
		int i = 0 ;
		for(List<?> l : lists) {
			if(l instanceof ListString) {
				array[i++] = (ListString) l;
			//	System.out.println(array[i]);
			}
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(lists.size());
	}

}
