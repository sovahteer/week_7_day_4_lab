package FantasyAdventure.Players.Cleric;

import FantasyAdventure.Players.Player;

public class Cleric extends Player {

    private int defend;

    public Cleric(String name, int hp) {
        super(name, hp);
        this.defend = 3;
    }

    public int defend(){
        return defend;
    }
}
