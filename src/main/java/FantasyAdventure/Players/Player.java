package FantasyAdventure.Players;

public abstract class Player {

    private String name;
    private int hp;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = 20;
    }
}
