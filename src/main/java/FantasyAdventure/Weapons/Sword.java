package FantasyAdventure.Weapons;

import FantasyAdventure.Behaviours.IWeapon;
import FantasyAdventure.Enemies.Enemy;

public class Sword implements IWeapon {

    private int damage;

    public Sword() {
        this.damage = 8;
    }

    public void attack(Enemy enemy){}

    public int getDamage(){
        return damage;
    }
}
