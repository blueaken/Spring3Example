package com.mkyong.spring.springaoptransaction.dao;

import com.mkyong.spring.springaoptransaction.model.Product;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by jianshen on 12/21/16.
 */
public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {

    public void save(Product product) {
        getHibernateTemplate().save(product);
    }

}
