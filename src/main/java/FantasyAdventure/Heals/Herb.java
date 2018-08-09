package FantasyAdventure.Heals;

import FantasyAdventure.Behaviours.IHeal;

public class Herb implements IHeal {

    private int restore;

    public Herb() {
        this.restore = 4;
    }

    public int heal(){
        return restore;
    }
}
