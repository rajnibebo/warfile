/**
 * 
 */
package com.rajni.effectivegenerics;

/**
 * @author rajni.ubhi
 * 
 */
public class ExtendedName extends SimpleName {

	private String ext;

	/**
	 * @param base
	 */
	public ExtendedName(String base, String ext) {
		super(base);
		// TODO Auto-generated constructor stub
		this.ext = ext;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		int n = super.compareTo(o);
		if (n == 0 && o instanceof ExtendedName) {
			return ext.compareTo(((ExtendedName) o).ext);
		} else {
			return n;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name n = new ExtendedName("Rajni", "Ubhi");
		Name n1 = new ExtendedName("Rajni", "Ubhi1");
		System.out.println(n.compareTo(n1) < 0);
		assert n.compareTo(n1) < 0;
	}

}
