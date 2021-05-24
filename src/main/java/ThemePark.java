import attractions.Attraction;
import people.Visitor;
import behaviours.IReviewed;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> attractionsAndStalls;

    public ThemePark(ArrayList<IReviewed> attractionsAndStalls) {

        this.attractionsAndStalls = attractionsAndStalls;
    }

    public int getAttractionsAndStalls() {
        return attractionsAndStalls.size();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList<IReviewed> reviewed = new ArrayList<>();
        for(IReviewed attraction : this.attractionsAndStalls){
            reviewed.add(attraction);
        }return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCountBy1();
        visitor.addAttractionToVisitedAttractions(attraction);
    }

    public HashMap<String, Integer> returnHashMapOfAllReviews(){
        HashMap<String, Integer> allReviews = new HashMap<>();
        for(IReviewed attraction : this.attractionsAndStalls){
            allReviews.put(attraction.getName(), attraction.getRating());
        }
        return allReviews;
    }
}
