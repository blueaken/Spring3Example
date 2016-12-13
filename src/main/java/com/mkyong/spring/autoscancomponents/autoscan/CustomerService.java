package com.mkyong.spring.autoscancomponents.autoscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jianshen on 12/12/16.
 */

@Component
public class CustomerService {

    @Autowired
    CustomerDAO customerDAO;

    @Override
    public String toString() {
        return "CustomerService { CustomerDAO = " + customerDAO + "}";
    }
}
