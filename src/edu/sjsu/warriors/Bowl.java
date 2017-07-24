package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class Bowl extends CustomizedDecorator {
    Burger burger;

    public Bowl(Burger burger, String kind) {
        this.burger = burger;

        if(kind == "Lettuce") {
            description = "Lettuce Blend";
        }
        else if(kind == "Greens") {
            description = "Organic Mixed Greens";
        }

    }

    public String getDescription() {

        return burger.getDescription() + " " + description;
    }

    public double cost() {

        return burger.cost() + 1.00;
    }
}
