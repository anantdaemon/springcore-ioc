/**
 * 
 */
package com.springcore.spingcore_ioc.pojo;

/**
 * POJO Class for Demo of Dependency Injection.
 */
public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	
	
	/**
	 * Super class constructor.
	 */
	public Employee() {
	super();
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAddress="
				+ employeeAddress + "]";
	}


	/**
	 * @param employeeId
	 * @param employeeName
	 * @param employeeAddress
	 */
	public Employee(int employeeId, String employeeName, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}


	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}


	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		System.out.println("Setter method called for employeeId on Object :" + this.hashCode());
		this.employeeId = employeeId;
	}


	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}


	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		System.out.println("Setter method called for employeeName on Object :" + this.hashCode());
		this.employeeName = employeeName;
	}


	/**
	 * @return the employeeAddress
	 */
	public String getEmployeeAddress() {
		return employeeAddress;
	}


	/**
	 * @param employeeAddress the employeeAddress to set
	 */
	public void setEmployeeAddress(String employeeAddress) {
		System.out.println("Setter method called for employeeAdress on Object :" + this.hashCode());
		this.employeeAddress = employeeAddress;
	}

}
