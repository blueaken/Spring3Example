package com.mkyong.spring.springaoptransaction.bo;

import com.mkyong.spring.springaoptransaction.dao.ProductQohDao;
import com.mkyong.spring.springaoptransaction.model.ProductQoh;

/**
 * Created by jianshen on 12/21/16.
 */
public interface ProductQohBo {
    public void setProductQohDao(ProductQohDao productQohDao);
    public void save(ProductQoh productQoh) throws Exception;
}
