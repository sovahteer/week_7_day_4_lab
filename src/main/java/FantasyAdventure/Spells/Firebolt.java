package FantasyAdventure.Spells;

import FantasyAdventure.Behaviours.ISpell;

public class Firebolt implements ISpell {

    private int damage;

    public Firebolt() {
        this.damage = 6;
    }

    public int cast(){
        return damage;
    }
}
