package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    private Visitor visitor_1;
    private Visitor visitor_2;
    private Visitor visitor_3;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor_1 = new Visitor(21,210.00,1000.00);
        visitor_2 = new Visitor(13,140.00,300.00);
        visitor_3 = new Visitor(9,120.00,100.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canGive50PercentDiscountIfVisitorAgeBelow12(){
        assertEquals(4.50, dodgems.priceFor(visitor_1), 0.00);
        assertEquals(4.50, dodgems.priceFor(visitor_2), 0.00);
        assertEquals(2.25, dodgems.priceFor(visitor_3), 0.00);
    }
}
