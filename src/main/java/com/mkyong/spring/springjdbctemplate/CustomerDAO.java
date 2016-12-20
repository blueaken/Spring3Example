package com.mkyong.spring.springjdbctemplate;

/**
 * Created by jianshen on 12/18/16.
 */
public interface CustomerDAO
{
    public void insert(Customer customer);
    public Customer findByCustomerId(int custId);
}
