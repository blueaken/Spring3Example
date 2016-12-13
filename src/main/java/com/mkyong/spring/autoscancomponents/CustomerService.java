package com.mkyong.spring.autoscancomponents;

/**
 * Created by jianshen on 12/12/16.
 */
public class CustomerService {

    CustomerDAO customerDAO;

    public void setCustomerDAO (CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public String toString() {
        return "CustomerService { CustomerDAO = " + customerDAO + "}";
    }
}
