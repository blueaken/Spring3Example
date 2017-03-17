package com.mkyong.spring.powermockitotest;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/**
 * Created by jianshen on 3/16/17.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest(ClassWithStaticMethods.class)
public class TestWithMockStaticMethods extends TestCase{

    public void test() {
        PowerMockito.mockStatic(ClassWithStaticMethods.class);

        when(ClassWithStaticMethods.getStaticString()).thenReturn("Hello!");
        assertEquals("Hello!", ClassWithStaticMethods.getStaticString());

        when(ClassWithStaticMethods.getStaticStringWithPara(anyString())).thenReturn("World!");
        assertEquals("World!", ClassWithStaticMethods.getStaticStringWithPara(anyString()));
    }
}
