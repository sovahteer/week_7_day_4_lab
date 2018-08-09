import FantasyAdventure.Spells.MagicMissile;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicMissileTest {

    MagicMissile magicMissile;

    @Before
    public void before(){
        magicMissile = new MagicMissile();
    }

    @Test
    public void canCast(){
        assertEquals(4, magicMissile.cast());
    }
}
