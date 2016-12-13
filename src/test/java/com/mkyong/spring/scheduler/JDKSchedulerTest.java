package com.mkyong.spring.scheduler;

import com.mkyong.spring.scheduler.JDKRunMeTask;
import junit.framework.TestCase;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by jianshen on 12/12/16.
 */
public class JDKSchedulerTest {

    public static void main(String[] args) {
        TimerTask task = new JDKRunMeTask();

        Timer timer = new Timer();
        timer.schedule(task, 1000, 10000);  //runs every 10 seconds with 1 second delay
    }

}
