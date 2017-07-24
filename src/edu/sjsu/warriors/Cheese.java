package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class Cheese extends CustomizedDecorator{
    Burger burger;
    String[] cheeseList;

    public Cheese(Burger burger, String[] cheeseList) {
        this.burger = burger;
        this.cheeseList = cheeseList;
    }

    public String getDescription() {
        String description = burger.getDescription() + ", ";

        for(String cheese: cheeseList) {
            description += cheese + ", ";
        }
        return description;
    }

    public double cost() {
        double cost = 0.00;
        if(cheeseList.length > 1) {
            cost += (cheeseList.length - 1) * 1.00;
        }
        return burger.cost() + cost;
    }
}
