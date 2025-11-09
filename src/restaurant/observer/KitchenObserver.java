package restaurant.observer;

import restaurant.factory.Meal;

public class KitchenObserver implements Observer {

    @Override
    public void update(Meal meal) {
        System.out.println("Kitchen recieved new order:" + meal.getDescription());
    }
}
