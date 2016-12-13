package com.mkyong.spring.scheduler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by jianshen on 12/12/16.
 */
public class SpringSchedulerTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/mkyong/spring-scheduler.xml");
    }

}
