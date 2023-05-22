import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before() {
        this.passenger = new Passenger("Jasper", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Jasper", this.passenger.getName());
    }
}
