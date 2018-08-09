package FantasyAdventure.Enemies;

import FantasyAdventure.Behaviours.IDefend;

public class Orc extends Enemy implements IDefend{

    private int defend;

    public Orc(int hp) {
        super(hp);
        this.defend = 2;
    }

    public int defend(){
        return defend;
    }
}
