package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    private Visitor visitor_1;
    private Visitor visitor_2;
    private Visitor visitor_3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor_1 = new Visitor(21,210.00,1000.00);
        visitor_2 = new Visitor(13,140.00,300.00);
        visitor_3 = new Visitor(9,120.00,100.00);
    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canAllowToTakeARideIfHEightOver145AndAgeOver12(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor_1));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor_2));
        assertEquals(false, rollerCoaster.isAllowedTo(visitor_3));
    }
}
