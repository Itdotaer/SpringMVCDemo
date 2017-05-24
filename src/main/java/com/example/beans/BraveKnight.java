package com.example.beans;

/**
 * Created by jt_hu on 2017/5/19.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }

}
