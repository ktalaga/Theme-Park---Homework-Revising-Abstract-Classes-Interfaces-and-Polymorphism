package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    private Visitor visitor_1;
    private Visitor visitor_2;
    private Visitor visitor_3;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitor_1 = new Visitor(21,210.00,1000.00);
        visitor_2 = new Visitor(13,140.00,300.00);
        visitor_3 = new Visitor(9,120.00,100.00);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canSellTobbacoIfOver18(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor_1));
        assertEquals(false, tobaccoStall.isAllowedTo(visitor_2));
    }
}
