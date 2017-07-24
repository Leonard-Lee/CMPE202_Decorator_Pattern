package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public abstract class Food {
    protected String description = "Unknown Burger";

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 0.00;
    }
}
