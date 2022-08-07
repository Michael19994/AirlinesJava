import org.junit.Before;
import org.junit.Test;

import static java.lang.Character.getName;
import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Julius", 1);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Julius", passenger.getName());
    }


    @Test
    public void addBagsToPassenger() {
        assertEquals(1, passenger.addBags(1,0));
    }

}
