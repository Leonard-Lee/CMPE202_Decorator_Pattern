package edu.sjsu.warriors;

/**
 * Created by leonardlee on 24/07/2017.
 */
public class YourOwnBurger extends Burger {
    public YourOwnBurger() {
        description = "Your Own Burger with";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 0.00;
    }
}
