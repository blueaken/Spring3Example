package com.mkyong.spring.springaoptransaction.bo;

import com.mkyong.spring.springaoptransaction.dao.ProductDao;
import com.mkyong.spring.springaoptransaction.model.Product;
import com.mkyong.spring.springaoptransaction.model.ProductQoh;

/**
 * Created by jianshen on 12/21/16.
 */
public class ProductBoImpl implements ProductBo {

    ProductDao productDao;
    ProductQohBo productQohBo;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void setProductQohBo(ProductQohBo productQohBo) {
        this.productQohBo = productQohBo;
    }

    //this method need to be transactional
    public void save(Product product, int qoh) throws Exception{

        productDao.save(product);
        System.out.println("Product Inserted");

        ProductQoh productQoh = new ProductQoh();
        productQoh.setProductId(product.getProductId());
        productQoh.setQty(qoh);

        productQohBo.save(productQoh);

    }
}
