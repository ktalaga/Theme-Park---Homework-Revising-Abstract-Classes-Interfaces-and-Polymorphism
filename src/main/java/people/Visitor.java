package people;


import attractions.Attraction;

import java.util.ArrayList;

public class Visitor  {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;
    private Attraction attraction;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public int getVisitedAttractions() {
        return visitedAttractions.size();
    }

    public void addAttractionToVisitedAttractions(Attraction attraction){
        this.visitedAttractions.add(attraction);
    }



}
