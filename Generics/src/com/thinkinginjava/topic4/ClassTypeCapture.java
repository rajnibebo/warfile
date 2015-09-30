/**
 * 
 */
package com.thinkinginjava.topic4;


/**
 * @author rajni.ubhi
 *
 */
public class ClassTypeCapture<T> {
	private Class<T> type;
	
	/**
	 * 
	 */
	public ClassTypeCapture(Class<T> type) {
		// TODO Auto-generated constructor stub
		this.type = type;
	}
	
	public boolean f(Object arg) {
		return type.isInstance(arg);
	}
	
	public static void main(String[] args) {
		ClassTypeCapture<Building> building = new ClassTypeCapture<>(Building.class);	
		ClassTypeCapture<House> house = new ClassTypeCapture<>(House.class);
		System.out.println(house.f(new Building()));  // false
		System.out.println(building.f(new House("Abc"))); // true
		
		Building b = new Building();
		House2 h = new House2();
		//b = (Building) h;
		h = (House2) b;
		System.out.println(b +" "+h);
		System.out.println(h);
		
	
	}
}
