package FantasyAdventure.Spells;

import FantasyAdventure.Behaviours.ISpell;

public class ConeOfCold implements ISpell {

    private int damage;

    public ConeOfCold() {
        this.damage = 4;
    }

    public int cast(){
        return damage;
    }
}
