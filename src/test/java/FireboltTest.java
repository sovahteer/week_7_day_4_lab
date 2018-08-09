import FantasyAdventure.Spells.Firebolt;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireboltTest {

    Firebolt firebolt;

    @Before
    public void before(){
        firebolt = new Firebolt();
    }

    @Test
    public void canCast(){
        assertEquals(6, firebolt.cast());
    }
}
