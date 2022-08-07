public class Pilot extends CabinCrewMember{
    private String pilotNumber;

    public Pilot(String name, String rank, String pilotNumber) {
        super(name, rank);
        this.pilotNumber = pilotNumber;
    }

    public String getPilotNumber() {
        return pilotNumber;
    }

    public String canFlyAPlane() {
        return "All Aboard";
    }
}
