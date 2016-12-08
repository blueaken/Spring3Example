package com.blueaken.core.bean;

/**
 * Created by jianshen on 11/30/16.
 */
/*
 ** Spring bean
*/
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printHello() {
        System.out.println("Spring 3 : Hello ! " + name);
    }
}
