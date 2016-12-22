package com.mkyong.spring.springhibernatemysql;

import com.mkyong.spring.springhibernatemysql.bo.StockBo;
import com.mkyong.spring.springhibernatemysql.model.Stock;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jianshen on 12/20/16.
 */
public class TestSpringHibernateMysql extends TestCase {
    public static final ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/mkyong/spring-hibernate-mysql.xml");

    public void testSpringHibernateMysql() {

        StockBo stockBo = (StockBo)appContext.getBean("stockBo");

        /** insert **/
        Stock stock = new Stock();
        stock.setStockCode("7668");
        stock.setStockName("HAIO");
        stockBo.save(stock);

        /** select **/
        Stock stock2 = stockBo.findByStockCode("7668");
        System.out.println(stock2);

        /** update **/
        stock2.setStockName("HAIO-1");
        stockBo.update(stock2);

        /** delete **/
        stockBo.delete(stock2);

        System.out.println("Done");
    }

}
