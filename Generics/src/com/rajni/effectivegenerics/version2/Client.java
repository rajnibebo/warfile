/**
 * 
 */
package com.rajni.effectivegenerics.version2;

/**
 * @author rajni.ubhi
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n1 = new ExtendedName("Rajni", "Ubhi");
		Name n2 = new ExtendedName("Rajni", "Ubhi1");
		System.out.println(n1.compareTo(n2));
	}

}
