package people;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;

public class Visitor implements ITicketed, ISecurity, IReviewed {

    private int age;
    private double height;
    private double money;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
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


    public double defaultPrice() {
        return 0;
    }

    public double priceFor(Visitor visitor) {
        return 0;
    }


    public boolean isAllowedTo(Visitor visitor) {
        return false;
    }

    public int getRating() {
        return 0;
    }


    public String getName() {
        return null;
    }
}
