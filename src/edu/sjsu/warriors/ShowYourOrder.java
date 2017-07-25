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
        System.out.println("The first customized burger");
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
        // Premium Toppings
        yourOwnBurger = new PremiumTopping(yourOwnBurger, new String[]{
                "Applewood Smoked Bacon"
        });
        // Step 4. Choose a Sauce
        yourOwnBurger = new Sauce(yourOwnBurger, new String[]{
                "Apricot Sauce"
        });
        System.out.println("Order: " + yourOwnBurger.getDescription());
        System.out.println("Price: " + yourOwnBurger.cost());

        // The second customized burger
        System.out.println("The second customized burger");
        Burger yourOwnBurger2 = new YourOwnBurger();
        // Step 1. Choose a Burger
        // meat name: Beef, Chicken, Turkey, Veggie
        // lb: 1/3lb, 2/3lb, 1lb
        yourOwnBurger2 = new Meat(yourOwnBurger2, "Beef", "1/3lb");
        yourOwnBurger2 = new Bowl(yourOwnBurger2, "Greens");
        // Step 2. Choose a Cheese
        yourOwnBurger2 = new Cheese(yourOwnBurger2, new String[]{"Greek Feta", "Imported Swiss", "Sharp Provolone"});
        // Step 3. Choose up to 4 Toppings
        yourOwnBurger2 = new Topping(yourOwnBurger2, new String[]{
                "Bermuda Red Onion", "Black Olives",
                "Carrot Strings", "Coleslaw", "Dill Pickle Chips"
        });

        // Step 5. Choose a Sauce
        yourOwnBurger2 = new Sauce(yourOwnBurger2, new String[]{
                "Brazil Pesto", "Classic Caesar"
        });
        System.out.println("Order: " + yourOwnBurger2.getDescription());
        System.out.println("Price: " + yourOwnBurger2.cost());
    }
}
