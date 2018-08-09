import FantasyAdventure.Heals.Herb;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbTest {

    Herb herb;

    @Before
    public void before(){
        herb = new Herb();
    }

    @Test
    public void canHeal(){
        assertEquals(4, herb.Heal());
    }
}
