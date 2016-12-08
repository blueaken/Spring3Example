package com.blueaken.core;

import com.blueaken.core.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring_config.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}
