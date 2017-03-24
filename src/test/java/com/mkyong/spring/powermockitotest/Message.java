package com.mkyong.spring.powermockitotest;

/**
 * Created by jianshen on 3/24/17.
 */
public class Message {
    private int id;
    private String content;

    public Message(int id, String content) {
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
