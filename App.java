package com.springcore.com.springcore;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
                    AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/com/springcore/comfig.xml");
                    
                    Employee employee=(Employee)context.getBean("emp");
                    System.out.println(employee);
    	
                    Laptop laptop=(Laptop)context.getBean("lap");
                    System.out.println(laptop);
    }
}
