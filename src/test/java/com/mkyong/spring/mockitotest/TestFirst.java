package com.mkyong.spring.mockitotest;

import junit.framework.TestCase;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by jianshen on 3/15/17.
 */
public class TestFirst extends TestCase{

    public void testFirst(){
        Second mockSecond = mock(Second.class);
        when(mockSecond.doSecond()).thenReturn("Stubbed Second");

        First first = new First(mockSecond);
        assertEquals("Stubbed Second", first.doSecond());
    }

}
