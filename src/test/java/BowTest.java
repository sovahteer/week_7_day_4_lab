import FantasyAdventure.Weapons.Bow;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowTest {

    Bow bow;

    @Before
    public void before(){
        bow = new Bow();
    }

    @Test
    public void canAttack(){
        assertEquals(8, bow.attack());
    }
}
