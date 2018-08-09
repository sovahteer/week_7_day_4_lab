package FantasyAdventure.Players.Fighter;

import FantasyAdventure.Behaviours.IWeapon;
import FantasyAdventure.Enemies.Enemy;
import FantasyAdventure.Weapons.Axe;
import FantasyAdventure.Weapons.Bow;
import FantasyAdventure.Weapons.Club;
import FantasyAdventure.Weapons.Sword;

import java.util.ArrayList;

public class Barbarian extends Fighter{

    private int defend;
    private Sword sword;
    private Bow bow;
    private Axe axe;
    private Club club;
    private IWeapon selectedWeapon;
    private ArrayList<IWeapon> weapons;

    public Barbarian(String name, int hp) {
        super(name, hp);
        weapons = new ArrayList<IWeapon>();
        this.defend = 1;
        sword = new Sword();
        axe = new Axe();
        bow = new Bow();
        club = new Club();
        this.addWeapons();
        selectedWeapon = null;
    }

    public void addWeapons(){
        weapons.add(sword);
        weapons.add(axe);
        weapons.add(bow);
        weapons.add(club);
    }

    public void selectWeapon(IWeapon weapon){
        selectedWeapon = weapon;
    }

    public IWeapon getSelectedWeapon() {
        return selectedWeapon;
    }

    public int getDamage(){
        return selectedWeapon.getDamage();}

    public int defend(){
        return defend;
    }

    public void attack(Enemy enemy){
        enemy.takeDamage(getDamage());
    }





}
