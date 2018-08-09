package FantasyAdventure.Weapons;

import FantasyAdventure.Behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damage;

    public Sword() {
        this.damage = 8;
    }

    public int attack(){
        return damage;
    }
}
