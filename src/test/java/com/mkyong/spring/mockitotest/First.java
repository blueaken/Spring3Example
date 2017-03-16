package com.mkyong.spring.mockitotest;

/**
 * Created by jianshen on 3/15/17.
 */
public class First {
    Second second ;

    public First(Second second){
        this.second = second;
    }

    public String doSecond(){
        return second.doSecond();
    }
}
