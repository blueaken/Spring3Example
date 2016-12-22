package com.mkyong.spring.springhibernatemysql.model;

import java.io.Serializable;

/**
 * Created by jianshen on 12/19/16.
 */
public class Stock implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long stockId;
    private String stockCode;
    private String stockName;

    //getter and setter methods

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public String toString() {
        //Stock [stockCode=7668, stockId=11, stockName=HAIO]
        return "Stock [stockCode=" + stockCode + ", stockId=" + stockId + ", stockName=" + stockName + "]";
    }
}
