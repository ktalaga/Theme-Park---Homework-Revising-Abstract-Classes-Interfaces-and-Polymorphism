import attractions.Dodgems;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private Dodgems dodgems;
    private RollerCoaster rollerCoaster;
    private ThemePark themePark;
    private ArrayList<IReviewed> attractions;
    private Visitor visitor;

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
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void canStoreAttractionsAndStalls(){
        assertEquals(4, themePark.getAttractionsAndStalls());
    }

    @Test
    public void canReturnAnArrayListOfReviewedAttractions(){
        assertEquals(attractions, themePark.getAllReviewed());
    }

    @Test
    public void whenVisiedAttractionAddedToVisitorListAndAttractionVisitCountIncreasesBy1(){
        themePark.visit(visitor, dodgems);
        assertEquals(1,visitor.getVisitedAttractions());
        assertEquals(1,dodgems.getVisitCount());
    }

    @Test
    public void canReturnAHashMapOfReviews(){
        HashMap<String, Integer> testHashMap = new HashMap<>();
        testHashMap.put(candyflossStall.getName(), candyflossStall.getRating());
        testHashMap.put(iceCreamStall.getName(), iceCreamStall.getRating());
        testHashMap.put(dodgems.getName(), dodgems.getRating());
        testHashMap.put(rollerCoaster.getName(), rollerCoaster.getRating());
        assertEquals(testHashMap, themePark.returnHashMapOfAllReviews());
    }


}
