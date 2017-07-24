package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class OldSchoolBurger extends Burger{
    public OldSchoolBurger() {
        description = "Old School";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 7.52;
    }
}
