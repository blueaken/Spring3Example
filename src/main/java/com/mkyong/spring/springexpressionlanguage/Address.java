package com.mkyong.spring.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jianshen on 12/14/16.
 */
@Component("addressBean")
public class Address {

    @Value("Lane 3061 Yangshupu Road, Shanghai")
    private String street;

    @Value("200090")
    private int postcode;

    @Value("China")
    private String country;

    public String getFullAddress(String prefix) {

        return prefix + " : " + street + " " + postcode + " " + country;
    }

    //getter and setter methods, required to make Spring manage the bean
    public String getStreet() {
        return street;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", postcode=" + postcode
                + ", country=" + country + "]";
    }
}
