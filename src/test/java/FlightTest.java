import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FlightTest {
        Flight flight;
        Pilot pilot;
        Passenger passenger;
        Passenger passenger2;
        Passenger passenger3;
        Passenger passenger4;
        Passenger passenger5;
        CabinCrewMember cabinCrewMember1;
        CabinCrewMember cabinCrewMember2;
        CabinCrewMember cabinCrewMember3;
        Plane plane;


    @Before
    public void setUp() {
        pilot = new Pilot("George", "Captain", "343");
        passenger = new Passenger("Jorge", 1);
        passenger2 = new Passenger("Marty", 1);
        passenger3 = new Passenger("Paul", 1);
        passenger4 = new Passenger("John", 1);
        passenger5 = new Passenger("Noah", 1);
        cabinCrewMember1 = new CabinCrewMember("Marty", "Security");
        cabinCrewMember2 = new CabinCrewMember("Colby", "Attendant");
        cabinCrewMember3 = new CabinCrewMember("Jorge", "Attendant");
        plane = new Plane(PlaneType.AIRCRAFT.getCapacity(), PlaneType.AIRCRAFT.getTotalWeight());
        flight = new Flight("34223A", "London", "Edinburgh", "18:45", plane);
    }

    @Test
    public void flightHasPilot() {
    assertEquals(pilot, flight.hasPilot(pilot));
    }

    @Test
    public void canAddCabinCrew() {
        flight.addCabinCrew(cabinCrewMember1);
        assertEquals(1, flight.getCabinCrewNumber());
    }

    @Test
    public void allCabinCrewOnFlight() {
        flight.addCabinCrew(cabinCrewMember1);
        flight.addCabinCrew(cabinCrewMember2);
        flight.addCabinCrew(cabinCrewMember3);
        assertTrue(flight.allCabinCrew());
    }

    @Test
    public void canAddPassengers() {
        flight.addPassengers(passenger);
        assertEquals(1, flight.getPassenger());
    }

    @Test
    public void allPassengers() {
        flight.addPassengers(passenger);
        assertTrue(flight.allPassengers());
    }

    @Test
    public void hasAircraft() {
        assertEquals(plane, flight.addAircraft());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("34223A", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("London", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport() {
        assertEquals("Edinburgh", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("18:45", flight.getDepartureAirportTime());
    }

    @Test
    public void numberAvailableSeats() {
        flight.addPassengers(passenger);
        assertEquals(3, flight.checkEmptySeats());
    }

    @Test
    public void ifEmptySeatsAddPassenger() {
        assertTrue(flight.checkInPassengers(passenger));
    }

    @Test
    public void refusePassengerIfFlightFull() {
        flight.checkInPassengers(passenger);
        flight.checkInPassengers(passenger2);
        flight.checkInPassengers(passenger3);
        flight.checkInPassengers(passenger4);
        flight.checkInPassengers(passenger5);
        assertEquals(4, flight.getPassenger());
    }
}

