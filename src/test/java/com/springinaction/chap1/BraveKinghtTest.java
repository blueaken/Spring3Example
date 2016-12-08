package com.springinaction.chap1;

import com.springinaction.components.Knight;
import com.springinaction.components.Quest;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by jianshen on 12/5/16.
 */
public class BraveKinghtTest extends TestCase {

    public void testKinghtShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);                  //create mock Test
        BraveKnight knight = new BraveKnight(mockQuest);      //inject mock Test
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

    public void testSlayDragon() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring_config.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
