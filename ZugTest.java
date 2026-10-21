

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ZugTest
{
     
 @Test
 
 public void testZuKlein()
{ Zug railjet; railjet = new Zug("Railjet", 0, true);
    railjet.printZug();
    assertEquals(1, railjet.getWagen());
}

@Test

public void testOK()
{
    Zug ice;
    ice = new Zug("ICE", 8, true);

    ice.printZug();
    assertEquals(8, ice.getWagen());
    assertEquals("ICE", ice.getBezeichnung());
    assertEquals(true, ice.getKlimatisiert());
}

@Test

public void testZuGross()
{
    Zug regionalzug;
    regionalzug = new Zug("Regionalzug", 31, false);

    regionalzug.printZug();
    assertEquals(1, regionalzug.getWagen());
}


}