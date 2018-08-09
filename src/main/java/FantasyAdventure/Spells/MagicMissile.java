package FantasyAdventure.Spells;

import FantasyAdventure.Behaviours.ISpell;

public class MagicMissile implements ISpell {

    private int damage;

    public MagicMissile() {
        this.damage = 4;
    }

    public int cast(){
        return damage;
    }
}
