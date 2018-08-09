package FantasyAdventure.Weapons;

import FantasyAdventure.Behaviours.IWeapon;
import FantasyAdventure.Enemies.Enemy;

public class Club implements IWeapon {

    private int damage;

    public Club() {
        this.damage = 6;
    }

    public void attack(Enemy enemy){}

    public int getDamage(){
        return damage;
    }
}
