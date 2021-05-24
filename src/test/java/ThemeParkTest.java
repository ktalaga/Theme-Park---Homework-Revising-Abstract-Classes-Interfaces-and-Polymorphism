import attractions.Dodgems;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private Dodgems dodgems;
    private RollerCoaster rollerCoaster;
    private ThemePark themePark;
    private ArrayList<IReviewed> attractions;

    @Before
    public void before(){
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4);
        dodgems = new Dodgems("Bumper Cars", 5);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        attractions = new ArrayList<>();
        attractions.add(candyflossStall);
        attractions.add(iceCreamStall);
        attractions.add(dodgems);
        attractions.add(rollerCoaster);
        themePark = new ThemePark(attractions);
    }

    @Test
    public void canStoreAttractionsAndStalls(){
        assertEquals(4, themePark.getAttractionsAndStalls());
    }

    @Test
    public void canReturnAnArrayListOfReviewedAttractions(){
        assertEquals(attractions, themePark.getAllReviewed());
    }


}
