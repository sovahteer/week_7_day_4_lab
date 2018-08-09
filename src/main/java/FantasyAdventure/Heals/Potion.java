package FantasyAdventure.Heals;

import FantasyAdventure.Behaviours.IHeal;

public class Potion implements IHeal {

    private int restore;

    public Potion() {
        this.restore = 6;
    }

    public int heal(){
        return restore;
    }
}
