package com.mkyong.spring.springaoptransaction.dao;

import com.mkyong.spring.springaoptransaction.model.ProductQoh;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by jianshen on 12/21/16.
 */
public class ProductQohDaoImpl extends HibernateDaoSupport implements ProductQohDao{

    public void save(ProductQoh productQoh) {
        getHibernateTemplate().save(productQoh);
    }

}
