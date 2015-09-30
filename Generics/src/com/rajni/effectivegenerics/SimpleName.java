/**
 * 
 */
package com.rajni.effectivegenerics;

/**
 * @author rajni.ubhi
 *
 */
class SimpleName implements Name{

	private String base;
	
	/**
	 * 
	 */
	public SimpleName(String base) {
		// TODO Auto-generated constructor stub
		this.base = base;
	}
	

	/* (non-Javadoc)
	 * @see com.rajni.effectivegenerics.Name#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return base.compareTo(((SimpleName)o).base);
	}

}
