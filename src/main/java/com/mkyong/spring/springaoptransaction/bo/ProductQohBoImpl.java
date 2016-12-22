package com.mkyong.spring.springaoptransaction.bo;

import com.mkyong.spring.springaoptransaction.dao.ProductQohDao;
import com.mkyong.spring.springaoptransaction.model.ProductQoh;

/**
 * Created by jianshen on 12/21/16.
 */
public class ProductQohBoImpl implements ProductQohBo{

    ProductQohDao productQohDao;

    public void setProductQohDao(ProductQohDao productQohDao) {
        this.productQohDao = productQohDao;
    }

    public void save(ProductQoh productQoh) throws Exception{

        throw new RuntimeException("For Purpose");

//        productQohDao.save(productQoh);
//        System.out.println("ProductQoh Inserted");
    }
}
