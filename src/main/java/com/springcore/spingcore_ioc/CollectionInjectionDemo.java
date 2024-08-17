/**
 * 
 */
package com.springcore.spingcore_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.spingcore_ioc.pojo.CollectionInjectionPojo;

/**
 * This class is made to use CollectionInjectionPojo and demonstrate collections injection in Spring.
 */
public class CollectionInjectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to CollectionInjectionDemo in Spring.");
		ApplicationContext context = new ClassPathXmlApplicationContext("CollectionInjection.xml");

		CollectionInjectionPojo pojo1 = (CollectionInjectionPojo) context.getBean("pojo1");
		
		System.out.println(pojo1);
	}

}
