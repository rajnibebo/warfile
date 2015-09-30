/**
 * 
 */
package com.rajni.effectivegenerics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajni.ubhi
 *
 */
public class LegacyLibrary {

	public static void addItems(List list) {
		list.add(new Integer(24));
		list.add("two");
	}
	
	public static List getItems() {
		List list = new ArrayList();
		list.add(new Integer(3));
		list.add("two");
		return list;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
