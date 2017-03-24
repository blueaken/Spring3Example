package com.mkyong.spring.powermockitotest;

import org.springframework.stereotype.Component;

/**
 * Created by jianshen on 3/24/17.
 */
@Component
public class SpringBean {
    public Message generateMessage() {
        final int id = ClassWithStaticMethods.getStaticInt();
        return new Message(id, "My bean message");
    }
}
