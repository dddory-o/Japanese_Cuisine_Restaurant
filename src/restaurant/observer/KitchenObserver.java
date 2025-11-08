package restaurant.observer;

import restaurant.factory.Meal;

public class KitchenObserver implements Observer {

    @Override
    public void update(String eventType, Meal meal) {
        if (eventType.equals("placed")) {
            System.out.println("Kitchen notified: New order for " + meal.getDescription());
        } else if (eventType.equals("delivered")) {
            System.out.println("Kitchen notified: " + meal.getDescription() + " has been delivered.");
        }
    }
}
