package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class Topping extends CustomizedDecorator{
    Burger burger;
    String[] toppings;

    // meat name: Beef, Chicken, Turkey, Veggie
    // lb: 1/3lb, 2/3lb, 1lb
    public Topping(Burger burger, String[] toppings) {
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
        double cost = 0.00;
        if(toppings.length > 4) {
            cost += (toppings.length - 4) * 0.75;
        }
        return burger.cost() + cost;
    }
}
