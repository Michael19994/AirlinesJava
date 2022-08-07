import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRCRAFT.getCapacity(), PlaneType.AIRCRAFT.getTotalWeight());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(4, plane.getCapacity());
    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(20, plane.getTotalWeight());
    }
}
