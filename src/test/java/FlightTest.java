import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    Plane plane;
    Passenger passenger1;

    @Before
    public void before() {
        this.pilot = new Pilot("Toby", Rank.CAPTAIN, "TK69XDXD");
        this.plane = new Plane(PlaneType.AIRBUS_A380);
        this.flight = new Flight(this.pilot, this.plane, "EK3847", "MRS", "EDI", "06:10");
        this.passenger1 = new Passenger("Jasper", 2);
    }

    @Test
    public void canAllocateSeat() {
        for(int i = 0; i < 100; i++) {
            this.flight.addPassengerToSeat(this.passenger1);
        }
        System.out.println(this.flight.getBookedPassengers().keySet());
        assertEquals(100, this.flight.getBookedPassengers().size());
    }
}
