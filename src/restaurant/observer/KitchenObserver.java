package restaurant.observer;

import restaurant.factory.drink.Drink;
import restaurant.factory.meal.Meal;
import restaurant.factory.soup.Soup;

public class KitchenObserver implements Observer {

    @Override
    public void update(Meal meal, Drink drink, Soup soup) {
        System.out.println("Kitchen recieved new order:");
        if (meal != null) {
            System.out.println("- Meal:" + meal.getDescription());
        }
        if (drink != null) {
            System.out.println("- Drink" + drink.getDescription());
        }
        if (soup != null) {
            System.out.println("- Soup" + soup.getDescription());
        }
        System.out.println(".");
    }
}
