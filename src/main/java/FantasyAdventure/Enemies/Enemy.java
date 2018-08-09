package FantasyAdventure.Enemies;


public abstract class Enemy {

    private int hp;

    public Enemy(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void takeDamage(int damage){
        hp -= damage;
    }
}