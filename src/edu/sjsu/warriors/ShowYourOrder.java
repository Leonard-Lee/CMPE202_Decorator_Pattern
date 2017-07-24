package edu.sjsu.warriors;

/**
 * Created by leonardlee on 23/07/2017.
 */
public class ShowYourOrder {
    public static void main(String[] args) {
        // Fried Onion Strings
        FriedOnionStrings friedOnionStrings = new FriedOnionStrings();
        System.out.println("Order: " + friedOnionStrings.getDescription());
        System.out.println("Price: " + friedOnionStrings.cost());

        // The Purist
        ThePuristBurger thePuristBurger = new ThePuristBurger();
        System.out.println("Order: " + thePuristBurger.getDescription());
        System.out.println("Price: " + thePuristBurger.cost());

        // Old School
        OldSchoolBurger oldSchoolBurger = new OldSchoolBurger();
        System.out.println("Order: " + oldSchoolBurger.getDescription());
        System.out.println("Price: " + oldSchoolBurger.cost());

        // Your Own Burger
        Burger yourOwnBurger = new YourOwnBurger();
        // meat name: Beef, Chicken, Turkey, Veggie
        // lb: 1/3lb, 2/3lb, 1lb
        yourOwnBurger = new Meat(yourOwnBurger, "Beef", "1/3lb");
        yourOwnBurger = new Bun(yourOwnBurger);
        yourOwnBurger = new Cheese(yourOwnBurger, new String[]{"Danish Blue Cheese", "Horseradish Cheddar"});
        yourOwnBurger = new Topping(yourOwnBurger, new String[]{
           "Bermuda Red Onion", "Black Olives",
                "Carrot Strings", "Coleslaw"
        });
        yourOwnBurger = new PremiumTopping(yourOwnBurger, new String[]{
                "Applewood Smoked Bacon"
        });
        yourOwnBurger = new Sauce(yourOwnBurger, new String[]{
                "Apricot Sauce"
        });
        System.out.println("Order: " + yourOwnBurger.getDescription());
        System.out.println("Price: " + yourOwnBurger.cost());
    }
}
