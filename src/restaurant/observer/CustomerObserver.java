package restaurant.observer;

import restaurant.factory.drink.Drink;
import restaurant.factory.meal.Meal;
import restaurant.factory.soup.Soup;

public class CustomerObserver implements Observer {
    private String customerName;

    public CustomerObserver(String name) {
        this.customerName = name;
    }

    @Override
    public void update(Meal meal, Drink drink, Soup soup) {
        System.out.println("Customer " + customerName + "notified: Your order is ready:");

        if (meal != null) {
            System.out.println(meal.getDescription());
        }
        if (drink != null) {
            System.out.println(drink.getDescription());
        }
        if (soup != null) {
            System.out.println(soup.getDescription());
        }
        System.out.println(".");
    }
}
