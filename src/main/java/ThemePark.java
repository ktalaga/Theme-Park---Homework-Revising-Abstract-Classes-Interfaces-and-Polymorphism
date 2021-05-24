import attractions.Attraction;
import people.Visitor;
import behaviours.IReviewed;

import java.util.ArrayList;

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
}
