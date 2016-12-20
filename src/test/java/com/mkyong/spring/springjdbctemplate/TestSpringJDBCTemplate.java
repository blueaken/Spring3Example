package com.mkyong.spring.springjdbctemplate;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jianshen on 12/18/16.
 */
public class TestSpringJDBCTemplate extends TestCase{

    public static final ApplicationContext context = new ClassPathXmlApplicationContext("spring/mkyong/spring-jdbc-template.xml");

    public void testSpringJDBCTemplate() {
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer("blueaken",28);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1);
    }

}
