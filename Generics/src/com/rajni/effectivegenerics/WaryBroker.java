/**
 * 
 */
package com.rajni.effectivegenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class WaryBroker {

	public static void processItems() {
		List<Integer> list = new ArrayList<Integer>();
		List view = Collections.checkedList(list, Integer.class);
		LegacyLibrary.addItems(view); // class cast exception
		
		List<Integer> list2 = LegacyLibrary.getItems();
		for(int n : list2) { // class cast exception
			
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		processItems();
	}

}
