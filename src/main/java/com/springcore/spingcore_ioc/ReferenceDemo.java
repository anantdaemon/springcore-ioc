package com.springcore.spingcore_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.spingcore_ioc.pojo.ReferenceDemoA;

public class ReferenceDemo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ReferenceDemo.xml");
		
		ReferenceDemoA a1 = (ReferenceDemoA) context.getBean("aref1");
		ReferenceDemoA a2 = (ReferenceDemoA) context.getBean("aref2");
		ReferenceDemoA a3 = (ReferenceDemoA) context.getBean("aref3");
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
	}

}
