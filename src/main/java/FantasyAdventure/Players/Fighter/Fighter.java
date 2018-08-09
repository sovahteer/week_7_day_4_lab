package FantasyAdventure.Players.Fighter;

import FantasyAdventure.Behaviours.IWeapon;
import FantasyAdventure.Players.Player;
import FantasyAdventure.Weapons.*;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IWeapon {


//    private Sword sword;
//    private Bow bow;
//    private Axe axe;
//    private Club club;
//    private IWeapon selectedWeapon;

    public Fighter(String name, int hp) {
        super(name, hp);
//        weapons = new ArrayList<IWeapon>();
//        sword = new Sword();
//        axe = new Axe();
//        bow = new Bow();
//        club = new Club();
//        this.addWeapons();
//        selectedWeapon = null;
    }

//    public void addWeapons(){
//        weapons.add(sword);
//        weapons.add(axe);
//        weapons.add(bow);
//        weapons.add(club);
//
//    }

//    public void selectWeapon(IWeapon weapon){
//        selectedWeapon = weapon;
//    }
//
//    public IWeapon getSelectedWeapon() {
//        return selectedWeapon;
//    }
//
//    public int getSelectedWeaponDamage(){
//        return selectedWeapon.getDamage();
//    }
}
