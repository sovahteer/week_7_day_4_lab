import FantasyAdventure.Enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc(20);
    }

    @Test
    public void canDefend(){
        assertEquals(2, orc.defend());
    }
}
