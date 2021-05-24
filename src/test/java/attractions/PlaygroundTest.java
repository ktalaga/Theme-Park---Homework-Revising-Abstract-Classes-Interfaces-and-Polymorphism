package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    private Visitor visitor_1;
    private Visitor visitor_2;
    private Visitor visitor_3;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor_1 = new Visitor(21,210.00,1000.00);
        visitor_2 = new Visitor(13,140.00,300.00);
        visitor_3 = new Visitor(9,120.00,100.00);

    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canAllowToUseIfAgeOver15(){
        assertEquals(true, playground.isAllowedTo(visitor_1));
        assertEquals(false, playground.isAllowedTo(visitor_2));
    }
}
