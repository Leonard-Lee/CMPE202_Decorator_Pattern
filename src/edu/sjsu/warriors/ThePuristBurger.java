package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class ThePuristBurger extends Burger{
    public ThePuristBurger() {
        description = "The Purist";
    }

    public String getDescription() {
        return description;
    }

    public double cost() {
        return 8.00;
    }
 }
