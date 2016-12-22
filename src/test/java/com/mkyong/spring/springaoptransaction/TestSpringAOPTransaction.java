package com.mkyong.spring.springaoptransaction;

import com.mkyong.spring.springaoptransaction.bo.ProductBo;
import com.mkyong.spring.springaoptransaction.model.Product;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jianshen on 12/20/16.
 */
public class TestSpringAOPTransaction extends TestCase {
    public static final ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/mkyong/spring-aop-transaction.xml");

    public void testSpringAOPTransaction() throws Exception{

//        Product product = new Product();
//        product.setProductCode("ABC");
//        product.setProductDesc("This is product ABC");
//
//        ProductBo productBo = (ProductBo)appContext.getBean("productBo");
//        productBo.save(product, 100);


        Product product1 = new Product();
        product1.setProductCode("ABC");
        product1.setProductDesc("This is product ABC");

        ProductBo productBo1 = (ProductBo)appContext.getBean("productBoProxy");
        productBo1.save(product1, 100);

    }

}
