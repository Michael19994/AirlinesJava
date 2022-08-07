import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Manuel", "Attendant");
    }

    @Test
    public void hasName() {
        assertEquals("Manuel", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("Attendant", cabinCrewMember.getRank());
    }

    @Test
    public void canTalkToPassengers() {
        assertEquals("Announcements", cabinCrewMember.talkToPassengers());
    }
}

