package FantasyAdventure.Weapons;

import FantasyAdventure.Behaviours.IWeapon;
import FantasyAdventure.Enemies.Enemy;

public class Bow implements IWeapon {

    private int damage;

    public Bow() {
        this.damage = 8;
    }

    public void attack(Enemy enemy){}

    public int getDamage(){
        return damage;
    }
}
