package com.mkyong.spring.springhibernatemysql.dao;

import com.mkyong.spring.springhibernatemysql.model.Stock;

/**
 * Created by jianshen on 12/19/16.
 */
public interface StockDao {

    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);

}
