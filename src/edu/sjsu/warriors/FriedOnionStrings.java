package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class FriedOnionStrings extends Food{
    public FriedOnionStrings() {
        description = "Fried Onion Strings";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 5.50;
    }
}
