import FantasyAdventure.Enemies.Orc;
import FantasyAdventure.Weapons.Bow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {

    Bow bow;
    Orc enemy;

    @Before
    public void before(){
        bow = new Bow();
        enemy = new Orc(12);
    }

//    @Test
//    public void canAttack(){
//        assertEquals(8, bow.attack(enemy));
//    }
}
