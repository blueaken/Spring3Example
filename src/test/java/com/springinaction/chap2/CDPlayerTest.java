package com.springinaction.chap2;

import com.springinaction.chap2.soundsystem.CompactDisc;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.junit.runner.RunWith;

/**
 * Created by jianshen on 12/8/16.
 */

//@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/springinaction_chap2.xml"})
public class CDPlayerTest extends TestCase {

    @Autowired
    private CompactDisc cd;

    public void testCDShouldNotBeNull() {
        assertNotNull(cd);
    }
}
