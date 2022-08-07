import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureAirportTime;
    private Plane plane;

    public Flight(String flightNumber, String destination, String departureAirport, String departureAirportTime, Plane plane) {
        this.passengers = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureAirportTime = departureAirportTime;
        this.plane = plane;
    }

    public Pilot hasPilot(Pilot pilot) {
        return pilot;
    }

    public int getCabinCrewNumber() {
        return this.cabinCrewMembers.size();
    }

    public void addCabinCrew(CabinCrewMember CrewMember) {
        this.cabinCrewMembers.add(CrewMember);
    }

    public boolean allCabinCrew() {
        if (cabinCrewMembers.size() >= 3) {
            return true;
        }
        return false;
    }

    public int getPassenger() {
        return this.passengers.size();
    }

    public void addPassengers(Passenger passengers) {
        this.passengers.add(passengers);
    }


    public boolean allPassengers() {
        if (passengers.size() <= 10 ) {
            return true;
        }
        return false;
    }

    public Plane addAircraft() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureAirportTime() {
        return this.departureAirportTime;
    }


    public int checkEmptySeats() {
      return plane.getCapacity() - passengers.size();
    }


    public boolean checkInPassengers(Passenger passenger) {
        if (this.checkEmptySeats() >= 1) {
            this.addPassengers(passenger);
            return true;
        }
        return false;
    }
}



