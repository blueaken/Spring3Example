package com.mkyong.spring.springaopannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jianshen on 3/26/17.
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/mkyong/spring-aop-annotation.xml");
        Operation e = (Operation) context.getBean("opBean");

        System.out.println("calling op1...");
        e.op1();
        System.out.println("calling op2...");
        e.op2();
    }
}
