package com.mkyong.spring.autoscancomponents;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jianshen on 12/12/16.
 */
public class CustomerServiceTest extends TestCase {

    public static final ApplicationContext context = new ClassPathXmlApplicationContext("spring/mkyong/spring-customer.xml");

    public void testCustomerService() {
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        System.out.println(customerService);
    }

}
