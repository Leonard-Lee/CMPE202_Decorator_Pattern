package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class PremiumTopping extends CustomizedDecorator{
    Burger burger;
    String[] toppings;

    public PremiumTopping(Burger burger, String[] toppings) {
        this.burger = burger;
        this.toppings = toppings;
    }

    public String getDescription() {
        String description = burger.getDescription();

        for(String topping: toppings) {
            description += topping + ", ";
        }
        return description;
    }

    public double cost() {
        return burger.cost() + toppings.length * 1.50;
    }
}
