package com.mkyong.spring.autoscancomponents.xml;

/**
 * Created by jianshen on 12/12/16.
 */

public class CustomerService {

    CustomerDAO customerDAO;

    //SJ: cannot be omitted here so as to make spring xml config works - can be omitted with Component annotation
    public void setCustomerDAO (CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Override
    public String toString() {
        return "CustomerService { CustomerDAO = " + customerDAO + "}";
    }
}
