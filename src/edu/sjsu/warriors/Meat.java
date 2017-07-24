package edu.sjsu.warriors;

import java.util.HashMap;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class Meat extends CustomizedDecorator{
    Burger burger;
    String meatName;
    double cost;

    // meat name: Beef, Chicken, Turkey, Veggie
    // lb: 1/3lb, 2/3lb, 1lb
    public Meat(Burger burger, String meatName, String lb) {
        this.burger = burger;
        this.meatName = meatName;
        if(lb == "1/3lb") {
            cost = 9.50;
        }
        else if(lb == "2/3lb") {
            cost = 11.50;
        }
        else if(lb == "1lb") {
            cost = 15.50;
        }
    }

    public String getDescription() {
        return burger.getDescription() + " " + meatName;
    }

    public double cost() {
        return burger.cost() + cost;
    }
}
