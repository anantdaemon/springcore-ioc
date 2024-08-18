package com.springcore.springcore_ioc.constructorDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDemo {

	public static void main (String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorConfig.xml");
		
		Person p1 = (Person) context.getBean("person1");
		Person p2 = (Person) context.getBean("person2");
		Person p3 = (Person) context.getBean("person3");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
