package com.springcore.spingcore_ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.spingcore_ioc.pojo.Employee;

import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
        
        Employee emp1 = (Employee) context.getBean("employee1");
        System.out.println(emp1);
        
        Employee emp2 = (Employee) context.getBean("employee2");
        System.out.println(emp2);
        
        Employee emp3 = (Employee) context.getBean("employee3");
        System.out.println(emp3);
    }
}
