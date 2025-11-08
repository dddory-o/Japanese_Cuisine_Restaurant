package restaurant.observer;

import restaurant.factory.Meal;

public class CustomerObserver implements Observer {
    private String name;

    public CustomerObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventType, Meal meal) {
        System.out.println("Customer " + name + " notified: Your " + meal.getDescription() + " is " + eventType + ".");
    }
}
