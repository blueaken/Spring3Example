package com.mkyong.spring.springhibernatemysql.bo;

import com.mkyong.spring.springhibernatemysql.dao.StockDao;
import com.mkyong.spring.springhibernatemysql.model.Stock;

/**
 * Created by jianshen on 12/19/16.
 */
public class StockBoImpl implements StockBo {

    StockDao stockDao;

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public void save(Stock stock){
        stockDao.save(stock);
    }

    public void update(Stock stock){
        stockDao.update(stock);
    }

    public void delete(Stock stock){
        stockDao.delete(stock);
    }

    public Stock findByStockCode(String stockCode){
        return stockDao.findByStockCode(stockCode);
    }
}
