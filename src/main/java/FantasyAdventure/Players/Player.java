package FantasyAdventure.Players;

import FantasyAdventure.Behaviours.IDefend;

public abstract class Player implements IDefend {

    private String name;
    private int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
