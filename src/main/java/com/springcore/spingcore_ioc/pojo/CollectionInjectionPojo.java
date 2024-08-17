/**
 * 
 */
package com.springcore.spingcore_ioc.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class is made to demonstrate collections injection in Spring Projects
 * using xml config file.
 */
public class CollectionInjectionPojo {

	/**
	 * Super Constructor.
	 */
	public CollectionInjectionPojo() {
		super();
	}

	private String empName;
	private List<String> empPhoneNum;
	private Set<String> empAddress;
	private Map<String, String> empCourses;

	/**
	 * @param empName
	 * @param empPhoneNum
	 * @param empAddress
	 * @param empCourses
	 */
	public CollectionInjectionPojo(String empName, List<String> empPhoneNum, Set<String> empAdress,
			Map<String, String> empCourses, Set<String> empAddress) {
		super();
		this.empName = empName;
		this.empPhoneNum = empPhoneNum;
		this.empAddress = empAddress;
		this.empCourses = empCourses;
	}

	/**
	 * @return the empAddress
	 */
	public Set<String> getEmpAddress() {
		return empAddress;
	}

	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empPhoneNum
	 */
	public List<String> getEmpPhoneNum() {
		return empPhoneNum;
	}

	/**
	 * @param empPhoneNum the empPhoneNum to set
	 */
	public void setEmpPhoneNum(List<String> empPhoneNum) {
		this.empPhoneNum = empPhoneNum;
	}

	/**
	 * @return the empCourses
	 */
	public Map<String, String> getEmpCourses() {
		return empCourses;
	}

	/**
	 * @param empCourses the empCourses to set
	 */
	public void setEmpCourses(Map<String, String> empCourses) {
		this.empCourses = empCourses;
	}

	@Override
	public String toString() {
		return "CollectionInjectionPojo \n["+"\n"+"empName = " + empName + ",\n" + "empPhoneNum = " + empPhoneNum + ", \n"
				+ "empAddress = " + empAddress + ",\n" + "empCourses = " + empCourses + "\n]";
	}

}
