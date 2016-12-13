package com.springinaction.chap2.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by jianshen on 12/8/16.
 */

@Component
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artists = "The Beatles";

    public void play() {
        System.out.println("Playing" + title + " by " + artists);
    }
}
