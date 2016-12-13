package com.mkyong.spring.scheduler;

import java.util.TimerTask;

/**
 * Created by jianshen on 12/12/16.
 *
 * for compare with spring scheduler purpose only
 *
 */
public class JDKRunMeTask extends TimerTask {

    @Override
    public void run() {
        System.out.println("Run Me ~");
    }

}
