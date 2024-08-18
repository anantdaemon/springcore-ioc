package com.springcore.springcore_ioc.constructorDemo;

import java.util.List;

import com.springcore.spingcore_ioc.pojo.ReferenceDemoB;

public class Person {
	
	private String name;
	private int personId;
	private List<Integer> phoneNum;
	private ReferenceDemoB obj;

	public Person(String name, int personId) {
		this.name = name;
		this.personId = personId;
	}
	
	public Person(String name, int personId, List<Integer> phoneNum, ReferenceDemoB obj) {
		this.name = name;
		this.personId = personId;
		this.phoneNum = phoneNum;
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", phoneNum=" + phoneNum + ", obj= " + obj + "]";
	}

}
