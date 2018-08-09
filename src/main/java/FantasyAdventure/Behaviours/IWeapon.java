package FantasyAdventure.Behaviours;

import FantasyAdventure.Enemies.Enemy;

public interface IWeapon {

    public void attack(Enemy enemy);

    public int getDamage();

}