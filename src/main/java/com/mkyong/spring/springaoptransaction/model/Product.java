package com.mkyong.spring.springaoptransaction.model;

import java.io.Serializable;

/**
 * Created by jianshen on 12/21/16.
 */
public class Product implements Serializable{

    private static final long serialVersionUID = 1L;

    private long productId;
    private String productCode;
    private String productDesc;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "Product [productCode=" + productCode + ", productId=" + productId + ", productDesc=" + productDesc + "]";
    }
}
