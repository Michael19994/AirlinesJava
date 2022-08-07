import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Hector", "Captain", "PTN001");
    }

    @Test
    public void pilotHasName() {
        assertEquals("Hector", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void pilotHasPilotNumber() {
        assertEquals("PTN001", pilot.getPilotNumber());
    }

    @Test
    public void canFlyAPlane() {
        assertEquals("All Aboard", pilot.canFlyAPlane());
    }
}
