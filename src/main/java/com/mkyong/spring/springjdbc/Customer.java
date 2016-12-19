package com.mkyong.spring.springjdbc;

/**
 * Created by jianshen on 12/18/16.
 */
public class Customer
{
    int custId;
    String name;
    int age;

    //constructor

    public Customer(int custId, String name, int age) {
        this.custId = custId;
        this.name = name;
        this.age = age;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter and setter methods

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer { CustId = " + custId + ", Name = " + name + ", Age = " + age + ".}";
    }
}
