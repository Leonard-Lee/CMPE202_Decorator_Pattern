package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class Bun extends CustomizedDecorator {
    Burger burger;

    public Bun(Burger burger) {
        this.burger = burger;
        description = "On A Bun";
    }

    public String getDescription() {
        return burger.getDescription() + " " + description;
    }

    public double cost() {
        return burger.cost();
    }
}
