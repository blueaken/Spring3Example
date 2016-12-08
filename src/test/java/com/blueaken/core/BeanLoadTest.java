package com.blueaken.core;

import com.blueaken.core.bean.HelloWorld;
import junit.framework.TestCase;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import junit.framework.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by jianshen on 11/30/16.
 */
public class BeanLoadTest extends TestCase {

    public void testBeanFactoryLoad() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring/spring_config.xml"));
        HelloWorld bean = (HelloWorld) bf.getBean("helloBean");

        assertEquals("ShenJian", bean.getName());
    }

    public void testApplicationContextLoad() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring_config.xml");
        HelloWorld bean = (HelloWorld) context.getBean("helloBean");

        assertEquals("ShenJian", bean.getName());
    }
}
