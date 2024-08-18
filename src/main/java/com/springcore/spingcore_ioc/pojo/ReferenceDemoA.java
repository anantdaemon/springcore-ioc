/**
 * 
 */
package com.springcore.spingcore_ioc.pojo;

/**
 * Demo class for demonstrating object reference bean.
 */
public class ReferenceDemoA {

	private int x;
	private ReferenceDemoB obj;
	
	
	@Override
	public String toString() {
		return "ReferenceDemoA [x=" + x + ", obj=" + obj + "]";
	}


	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}


	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}


	/**
	 * @return the obj
	 */
	public ReferenceDemoB getObj() {
		return obj;
	}


	/**
	 * @param obj the obj to set
	 */
	public void setObj(ReferenceDemoB obj) {
		this.obj = obj;
	}


	/**
	 * Constructor.
	 */
	public ReferenceDemoA() {
		super();
	}

}
