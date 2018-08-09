package FantasyAdventure.Weapons;

import FantasyAdventure.Behaviours.IWeapon;
import FantasyAdventure.Enemies.Enemy;

public class Axe implements IWeapon {

    private int damage;

    public Axe() {
        this.damage = 10;
    }

    public void attack(Enemy enemy){}

    public int getDamage(){
        return damage;
    }
}
