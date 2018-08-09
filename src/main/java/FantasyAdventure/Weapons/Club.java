package FantasyAdventure.Weapons;

import FantasyAdventure.Behaviours.IWeapon;

public class Club implements IWeapon {

    private int damage;

    public Club() {
        this.damage = 6;
    }

    public int attack(){
        return damage;
    }
}
