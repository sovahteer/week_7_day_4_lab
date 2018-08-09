import FantasyAdventure.Weapons.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {

    Club club;

    @Before
    public void before(){
        club = new Club();
    }

    @Test
    public void canAttack(){
        assertEquals(6, club.attack());
    }
}
