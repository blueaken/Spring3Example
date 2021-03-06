package com.springinaction.chap1;

import com.springinaction.components.Knight;
import com.springinaction.components.Quest;

/**
 * Created by jianshen on 12/5/16.
 */
public class CowardKnight implements Knight {

    private Quest quest;

    public CowardKnight(Quest quest) {     //Quest is injected by constructor. Constructor Injection
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
