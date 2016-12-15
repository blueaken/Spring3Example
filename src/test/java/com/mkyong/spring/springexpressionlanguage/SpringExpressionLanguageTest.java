package com.mkyong.spring.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jianshen on 12/12/16.
 */
public class SpringExpressionLanguageTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/mkyong/spring-expression-language.xml");

        Customer obj = (Customer)context.getBean("customerBean");
        System.out.print(obj);
    }

}
