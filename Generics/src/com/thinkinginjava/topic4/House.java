/**
 * 
 */
package com.thinkinginjava.topic4;

/**
 * @author rajni.ubhi
 *
 */
public class House extends Building{
	private String name = "House";

	/**
	 * 
	 */
	public House() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	public House(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "House";
	}
	
}
