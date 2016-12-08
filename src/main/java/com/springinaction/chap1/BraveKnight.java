package com.springinaction.chap1;

import com.springinaction.components.Knight;
import com.springinaction.components.Quest;

/**
 * Created by jianshen on 12/5/16.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {     //Quest is injected by constructor. Constructor Injection
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
