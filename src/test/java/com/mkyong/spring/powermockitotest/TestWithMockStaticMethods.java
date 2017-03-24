package com.mkyong.spring.powermockitotest;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.modules.junit4.PowerMockRunnerDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/**
 * Created by jianshen on 3/16/17.
 */

@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/powermock/powermock_with_springtest.xml"})
@PrepareForTest(ClassWithStaticMethods.class)
public class TestWithMockStaticMethods extends TestCase{

    @Autowired
    private SpringBean springBean;

    @Test
    public void testPowerMock() {
        PowerMockito.mockStatic(ClassWithStaticMethods.class);

        when(ClassWithStaticMethods.getStaticString()).thenReturn("Hello!");
        assertEquals("Hello!", ClassWithStaticMethods.getStaticString());

        when(ClassWithStaticMethods.getStaticStringWithPara(anyString())).thenReturn("World!");
        assertEquals("World!", ClassWithStaticMethods.getStaticStringWithPara(anyString()));
    }

    @Test
    public void testPowerMockWithSpringJUnit4Test() {
        PowerMockito.mockStatic(ClassWithStaticMethods.class);
        final int expectedId = 35;

        when(ClassWithStaticMethods.getStaticInt()).thenReturn(expectedId);
        final Message message = springBean.generateMessage();

        assertEquals(expectedId, message.getId());
        assertEquals("My bean message", message.getContent());
    }
}
