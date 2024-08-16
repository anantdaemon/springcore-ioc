package com.springcore.spingcore_ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
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
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp);
    }
}
