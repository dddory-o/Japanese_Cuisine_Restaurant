package restaurant.facade;

import restaurant.decorator.*;
import restaurant.factory.menu_factory.*;
import restaurant.observer.*;
import restaurant.strategy.*;
import restaurant.visitor.*;

import restaurant.factory.Product;
import java.util.List;

public class RestaurantFacade {

    private final DrinkFactory drinkFactory;
    private final MealFactory mealFactory;
    private final SoupFactory soupFactory;
    private final OrderManager orderManager;

    public RestaurantFacade() {
        this.drinkFactory = new DrinkFactoryImpl();
        this.mealFactory = new MealFactoryImpl();
        this.soupFactory = new SoupFactoryImpl();
        this.orderManager = new OrderManager();

        orderManager.addObserver(new KitchenObserver());
        orderManager.addObserver(new CustomerObserver());

    }

    public void showMenu() {
        System.out.println("----- JAPANESE CUISINE MENU -----");

        System.out.println("Meals:");
        printSafeMeal("sushi");
        printSafeMeal("rolls");
        printSafeMeal("sushi burger");

        System.out.println("\nSoups:");
        printSafeSoup("ramen");
        printSafeSoup("kuksi");
        printSafeSoup("miso soup");

        System.out.println("\nDrinks:");
        printSafeDrink("coke");
        printSafeDrink("sprite");
        printSafeDrink("fanta");
    }

    private void printSafeMeal(String name) {
        var meal = mealFactory.createMeal(name);
        if (meal != null) System.out.println(" - " + meal.getDescription());
    }

    private void printSafeSoup(String name) {
        var soup = soupFactory.createSoup(name);
        if (soup != null) System.out.println(" - " + soup.getDescription());
    }

    private void printSafeDrink(String name) {
        var drink = drinkFactory.createDrink(name);
        if (drink != null) System.out.println(" - " + drink.getDescription());
    }



    public void placeOrder(String mealType, String soupType, String drinkType, String preparationType, List<String> additions) {
        System.out.println("\n--- New Order ---");

        var meal = mealFactory.createMeal(mealType.trim().toLowerCase());
        var soup = soupFactory.createSoup(soupType.trim().toLowerCase());
        var drink = drinkFactory.createDrink(drinkType.trim().toLowerCase());

        if (meal == null && soup == null && drink == null) {
            System.out.println("No valid items in the order!");
            return;
        }
        Product decoratedProduct = null;
        if (meal != null) {
            decoratedProduct = meal; // start with the original meal

            if (additions != null) {
                for (String add : additions) {
                    switch (add.toLowerCase()) {
                        case "bread" -> decoratedProduct = new BreadDecorator(decoratedProduct);
                        case "wasabi" -> decoratedProduct = new WasabiDecorator(decoratedProduct);
                        case "soysauce" -> decoratedProduct = new SoySauceDecorator(decoratedProduct);
                        case "chopsticks" -> decoratedProduct = new ChopstickDecorator(decoratedProduct);
                    }
                }
            }
        }


        // --- Apply preparation strategy (only for meals) ---
        if (meal != null) {
            PreparationStrategy preparation = switch (preparationType.toLowerCase()) {
                case "fried" -> new FriedPreparation();
                case "baked" -> new BakedPreparation();
                default -> new RawPreparation();
            };
            preparation.prepare(meal);
        }

        // --- Decorators (add optional extras) ---
        ProductDecorator decoratedMeal = null;
        if (meal != null) {
            decoratedMeal = new SoySauceDecorator(
                    new ChopstickDecorator(
                            new BreadDecorator(meal) // you can add/remove decorators here
                    )
            );
        }

        ProductDecorator decoratedSoup = null;
        if (soup != null) {
            decoratedSoup = new SoySauceDecorator(
                    new ChopstickDecorator(soup)
            );
        }

        ProductDecorator decoratedDrink = null;
        if (drink != null) {
            decoratedDrink = new SoySauceDecorator(drink); // just for demonstration
        }

        // --- Visitors ---
        PriceVisitor priceVisitor = new PriceVisitor();
        CalorieVisitor calorieVisitor = new CalorieVisitor();

        if (decoratedMeal != null) {
            decoratedMeal.accept(priceVisitor);
            decoratedMeal.accept(calorieVisitor);
        }
        if (decoratedSoup != null) {
            decoratedSoup.accept(priceVisitor);
            decoratedSoup.accept(calorieVisitor);
        }
        if (decoratedDrink != null) {
            decoratedDrink.accept(priceVisitor);
            decoratedDrink.accept(calorieVisitor);
        }

        // --- Order summary ---
        System.out.println("\nOrder summary:");
        if (decoratedMeal != null) System.out.println("Meal: " + decoratedMeal.getDescription());
        if (decoratedSoup != null) System.out.println("Soup: " + decoratedSoup.getDescription());
        if (decoratedDrink != null) System.out.println("Drink: " + decoratedDrink.getDescription());

        System.out.println("Total Price: " + priceVisitor.getTotalCost());
        System.out.println("Total Calories: " + calorieVisitor.getTotalCalories());

        // --- Notify observers ---
        if (decoratedMeal != null) orderManager.placeOrder(decoratedMeal);
        if (decoratedSoup != null) orderManager.placeOrder(decoratedSoup);
        if (decoratedDrink != null) orderManager.placeOrder(decoratedDrink);
    }


    public void showNotifications() {
        System.out.println("\n--- Notifications ---");
        orderManager.notifyObservers();
    }
}
