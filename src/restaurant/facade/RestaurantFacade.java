package restaurant.facade;

import restaurant.decorator.*;
import restaurant.factory.menu_factory.*;
import restaurant.observer.*;
import restaurant.strategy.*;
import restaurant.visitor.*;


import java.util.ArrayList;
import java.util.List;

public class RestaurantFacade {

    private final DrinkFactory drinkFactory;
    private final MealFactory mealFactory;
    private final SoupFactory soupFactory;
    private final OrderManager orderManager;
    private final List<Observer> observers;

    public RestaurantFacade() {
        this.drinkFactory = new DrinkFactoryImpl();
        this.mealFactory = new MealFactoryImpl();
        this.soupFactory = new SoupFactoryImpl();
        this.orderManager = new OrderManager();
        this.observers = new ArrayList<>();

        // Add restaurant observers
        observers.add(new KitchenObserver());
        observers.add(new CustomerObserver());

        // Register observers in order manager
        for (Observer o : observers) {
            orderManager.addObserver(o);
        }
    }

    public void showMenu() {
        System.out.println("----- JAPANESE CUISINE MENU -----");
        System.out.println("Meals:");
        System.out.println("1. " + mealFactory.createMeal("Sushi").getDescription());
        System.out.println("2. " + mealFactory.createMeal("Rolls").getDescription());
        System.out.println("3. " + mealFactory.createMeal("SushiBurger").getDescription());

        System.out.println("\nSoups:");
        System.out.println("1. " + soupFactory.createSoup("Ramen").getDescription());
        System.out.println("2. " + soupFactory.createSoup("Kuksi").getDescription());
        System.out.println("3. " + soupFactory.createSoup("MisoSoup").getDescription());

        System.out.println("\nDrinks:");
        System.out.println("1. " + drinkFactory.createDrink("Coke").getDescription());
        System.out.println("2. " + drinkFactory.createDrink("Sprite").getDescription());
        System.out.println("3. " + drinkFactory.createDrink("Fanta").getDescription());
    }

    public void placeOrder(String mealType, String soupType, String drinkType, String preparationType) {
        System.out.println("\n--- New Order ---");

        var meal = mealFactory.createMeal(mealType);
        var soup = soupFactory.createSoup(soupType);
        var drink = drinkFactory.createDrink(drinkType);

        PreparationStrategy preparation;
        switch (preparationType.toLowerCase()) {
            case "fried" -> preparation = new FriedPreparation();
            case "baked" -> preparation = new BakedPreparation();
            default -> preparation = new RawPreparation();
        }
        preparation.prepare(meal.getDescription());

        ProductDecorator decoratedProduct = new SoySauceDecorator(new ChopstickDecorator(meal));

        PriceVisitor priceVisitor = new PriceVisitor();
        CalorieVisitor calorieVisitor = new CalorieVisitor();

        meal.accept(priceVisitor);
        soup.accept(priceVisitor);
        drink.accept(priceVisitor);

        meal.accept(calorieVisitor);
        soup.accept(calorieVisitor);
        drink.accept(calorieVisitor);

        double totalPrice = priceVisitor.getTotalCost();
        double totalCalories = calorieVisitor.getTotalCalories();

        System.out.println("\nOrder summary:");
        System.out.println("Meal: " + meal.getDescription());
        System.out.println("Soup: " + soup.getDescription());
        System.out.println("Drink: " + drink.getDescription());
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Total Calories: " + totalCalories + " kcal");

    }

    public void showNotifications() {
        System.out.println("\n--- Notifications ---");
        orderManager.notifyObservers();
    }
}
