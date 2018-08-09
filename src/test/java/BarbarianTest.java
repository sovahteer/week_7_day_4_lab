import FantasyAdventure.Enemies.Orc;
import FantasyAdventure.Players.Fighter.Barbarian;
import FantasyAdventure.Weapons.Axe;
import FantasyAdventure.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Axe axe;
    Sword sword;
    Orc orc;

    @Before
    public void before(){
        barbarian = new Barbarian("Emen", 12);
        axe = new Axe();
        sword = new Sword();
        orc = new Orc(12);
    }

    @Test
    public void canEquipWeapon(){
        barbarian.selectWeapon(axe);
        assertEquals(axe, barbarian.getSelectedWeapon());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.selectWeapon(axe);
        barbarian.selectWeapon(sword);
        assertEquals(sword, barbarian.getSelectedWeapon());
    }

    @Test
    public void canDamageOrc(){
        barbarian.attack(orc);
        assertEquals(11,orc.getHp());
    }


}
