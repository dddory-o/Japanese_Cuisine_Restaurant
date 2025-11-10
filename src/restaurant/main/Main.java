package restaurant.main;

import restaurant.factory.menu_factory.*;
import restaurant.observer.CustomerObserver;
import restaurant.observer.KitchenObserver;
import restaurant.observer.OrderManager;

public class Main {
    public static void main(String[] args) {
        MealFactory mealFactory = new MealFactoryImpl();
        DrinkFactory drinkFactory = new DrinkFactoryImpl();
        SoupFactory soupFactory = new SoupFactoryImpl();

        OrderManager orderManager = new OrderManager();
        orderManager.addObserver(new CustomerObserver("Dinara"));
        orderManager.addObserver(new KitchenObserver());



    }
}