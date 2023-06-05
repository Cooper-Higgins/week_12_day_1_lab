import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {
    Bottle bottle;

    @Before
    public void before(){
        bottle = new Bottle(100);
    }

    @Test
    public void drinkVolume(){
        assertEquals(90, bottle.drinkVolume());
    }

    @Test
    public void emptyVolume(){
        assertEquals(0, bottle.emptyVolume());
    }

    @Test
    public void fillVolume(){
        assertEquals(100, bottle.fillVolume());
    }
}
