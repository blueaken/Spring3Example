package com.springinaction.chap1;

import com.springinaction.components.Quest;

import java.io.PrintStream;

/**
 * Created by jianshen on 12/5/16.
 */
public class SlayDragonQuest implements Quest {
    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
