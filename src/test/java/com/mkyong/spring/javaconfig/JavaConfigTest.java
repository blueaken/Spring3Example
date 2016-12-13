package com.mkyong.spring.javaconfig;

import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by jianshen on 12/12/16.
 */
public class JavaConfigTest extends TestCase {
    public static final ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    public void testJavaConfig () {

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");

        obj.printHelloWorld("Spring3 Java Config");
    }

}
