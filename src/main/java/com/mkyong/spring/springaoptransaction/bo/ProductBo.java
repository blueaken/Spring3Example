package com.mkyong.spring.springaoptransaction.bo;

import com.mkyong.spring.springaoptransaction.dao.ProductDao;
import com.mkyong.spring.springaoptransaction.model.Product;

/**
 * Created by jianshen on 12/21/16.
 */
public interface ProductBo {
    public void setProductDao(ProductDao productDao);
    public void setProductQohBo(ProductQohBo productQohBo);
    //this method need to be transactional
    public void save(Product product, int qoh) throws Exception;
}
