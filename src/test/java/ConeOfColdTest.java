import FantasyAdventure.Spells.ConeOfCold;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConeOfColdTest {

    ConeOfCold coneOfCold;

    @Before
    public void before(){
        coneOfCold = new ConeOfCold();
    }

    @Test
    public void canCast(){
        assertEquals(4, coneOfCold.cast());
    }
}
