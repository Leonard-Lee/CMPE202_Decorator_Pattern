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
        // Step 1. Choose a Burger
        // meat name: Beef, Chicken, Turkey, Veggie
        // lb: 1/3lb, 2/3lb, 1lb
        yourOwnBurger = new Meat(yourOwnBurger, "Beef", "1/3lb");
        yourOwnBurger = new Bun(yourOwnBurger);
        // Step 2. Choose a Cheese
        yourOwnBurger = new Cheese(yourOwnBurger, new String[]{"Danish Blue Cheese", "Horseradish Cheddar"});
        // Step 3. Choose up to 4 Toppings
        yourOwnBurger = new Topping(yourOwnBurger, new String[]{
           "Bermuda Red Onion", "Black Olives",
                "Carrot Strings", "Coleslaw"
        });
        // Step 4. Premium Toppings
        yourOwnBurger = new PremiumTopping(yourOwnBurger, new String[]{
                "Applewood Smoked Bacon"
        });
        // Step 5. Choose a Sauce
        yourOwnBurger = new Sauce(yourOwnBurger, new String[]{
                "Apricot Sauce"
        });
        System.out.println("Order: " + yourOwnBurger.getDescription());
        System.out.println("Price: " + yourOwnBurger.cost());
    }
}
