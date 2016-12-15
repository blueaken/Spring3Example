package com.mkyong.spring.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jianshen on 12/14/16.
 */
@Component("customerBean")
public class Customer {

    @Value("#{addressBean}")
    private Address address;

    @Value("#{addressBean.country}")
    private String country;

    @Value("#{addressBean.getFullAddress('blueaken')}")
    private String fullAddress;

    //getter and setter methods

    @Override
    public String toString() {
        return "Customer [address=" + address + "\n, country=" + country
                + "\n, fullAddress=" + fullAddress + "]";
    }
}
