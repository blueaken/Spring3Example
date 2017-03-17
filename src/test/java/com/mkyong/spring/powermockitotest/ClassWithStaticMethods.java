package com.mkyong.spring.powermockitotest;

/**
 * Created by jianshen on 3/16/17.
 */
public class ClassWithStaticMethods {
    public static String getStaticString() {
        return "String";
    }

    public static String getStaticStringWithPara(String string) {
        return "String: " + string;
    }

    public static int getStaticInt() {
        return 1;
    }
}
