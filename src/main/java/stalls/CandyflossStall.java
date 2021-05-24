package stalls;

import people.Visitor;

public class CandyflossStall extends Stall {

    public CandyflossStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }


    public int getRating() {
        return 0;
    }


    public boolean isAllowedTo(Visitor visitor) {
        return true;
    }
}
