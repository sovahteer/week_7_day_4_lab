import FantasyAdventure.Enemies.Enemy;
import FantasyAdventure.Enemies.Orc;
import FantasyAdventure.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;
    Enemy enemy;

    @Before
    public void before(){
        enemy = new Orc(12);

    }

//    @Test
//    public void canAttack(){
//        assertEquals(8, sword.attack(enemy));
//    }
}
