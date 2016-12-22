package com.mkyong.spring.springaoptransaction.model;

import java.io.Serializable;

/**
 * Created by jianshen on 12/21/16.
 */
public class ProductQoh implements Serializable {

    private static final long serialVersionUID = 1L;

    private long qohId;
    private long productId;
    private int qty;

    public long getQohId() {
        return qohId;
    }

    public void setQohId(long qohId) {
        this.qohId = qohId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Product [qohId=" + qohId + ", productId=" + productId + ", qty=" + qty + "]";
    }
}
