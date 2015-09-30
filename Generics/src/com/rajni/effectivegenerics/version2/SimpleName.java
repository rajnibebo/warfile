/**
 * 
 */
package com.rajni.effectivegenerics.version2;

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
	public int compareTo(Name o) {
		// TODO Auto-generated method stub
		return base.compareTo(((SimpleName)o).base);
	}

}
