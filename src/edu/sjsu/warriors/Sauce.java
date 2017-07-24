package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class Sauce extends CustomizedDecorator{
    Burger burger;
    String[] sauceList;

    public Sauce(Burger burger, String[] sauceList) {
        this.burger = burger;
        this.sauceList = sauceList;
    }

    public String getDescription() {
        String description = burger.getDescription();

        for(String sauce: sauceList) {
            description += sauce + ", ";
        }
        return description;
    }

    public double cost() {
        double cost = 0.00;
        for(String sauce: sauceList) {
            if(sauce != "Apricot Sauce") {
                cost += 0.75;
            }
        }
        return burger.cost() + cost;
    }
}
