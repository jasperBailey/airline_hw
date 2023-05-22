import java.util.ArrayList;
import java.util.HashMap;

public class Flight {
    private Pilot captain;
    private Plane plane;
    private ArrayList<CabinCrewMember> cabinCrew;
    private HashMap<Integer, Passenger> bookedPassengers;

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot captain, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.captain = captain;
        this.plane = plane;
        this.cabinCrew = new ArrayList<>();
        this.bookedPassengers = new HashMap<>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public void addPassengerToSeat(Passenger passenger) {
        int planeCapacity = this.getPlane().getPlaneType().getPassengerCapacity();
        int seatToAdd = (int) Math.floor(Math.random() * planeCapacity);
        this.bookedPassengers.put(seatToAdd, passenger);
    }

    public void setCaptain(Pilot captain) {
        this.captain = captain;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Pilot getCaptain() {
        return captain;
    }

    public Plane getPlane() {
        return plane;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public HashMap<Integer, Passenger> getBookedPassengers() {
        return bookedPassengers;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
