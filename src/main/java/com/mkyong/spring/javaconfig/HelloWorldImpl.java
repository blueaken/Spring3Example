package com.mkyong.spring.javaconfig;

/**
 * Created by jianshen on 12/12/16.
 */
public class HelloWorldImpl implements HelloWorld {

    public void printHelloWorld(String msg) {
        System.out.println("Hello: " + msg);
    }
}
